CREATE DATABASE  IF NOT EXISTS `bit2bit` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bit2bit`;
-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: bit2bit
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tb_pregunta`
--

DROP TABLE IF EXISTS `tb_pregunta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_pregunta` (
  `idpregunta` bigint NOT NULL AUTO_INCREMENT,
  `detalle` varchar(255) NOT NULL,
  `fecha` date NOT NULL,
  `titulo` varchar(255) NOT NULL,
  PRIMARY KEY (`idpregunta`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_pregunta`
--

LOCK TABLES `tb_pregunta` WRITE;
/*!40000 ALTER TABLE `tb_pregunta` DISABLE KEYS */;
INSERT INTO `tb_pregunta` VALUES (1,'tengo esta duda para poder subir mi proyecto a mi github','2023-01-07','como subo mi proyecto a mi github?'),(2,'necesito algunas dependencias para mi proyecto.','2023-01-07','donde descargo las dependencias de maven?'),(3,'quiero saber que lenguaje es mas recomendable usar para desarrollar aplicaciones moviles hoy en día.','2023-01-07','qué es mas recomendable para desarrollar aplicaciones moviles kotlin o java?'),(4,'quiero empezar a trabajar con maven y el framework spring, quiero saber que versión de java es recomendable usar?','2023-01-07','que versión de java es recomendable usar para crear un proyecto spring/maven? '),(5,'me gustaría saber cual es mejor para dar estilos a mis aplicaciones web.','2023-01-07','qué es mejor bootstrap o css ?');
/*!40000 ALTER TABLE `tb_pregunta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_respuesta`
--

DROP TABLE IF EXISTS `tb_respuesta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_respuesta` (
  `idrpta` bigint NOT NULL AUTO_INCREMENT,
  `detallerpta` varchar(255) NOT NULL,
  `fecharpta` date NOT NULL,
  `id_pregunta` bigint DEFAULT NULL,
  PRIMARY KEY (`idrpta`),
  KEY `FKfwgk3xq9hfhn04749gjbak7ql` (`id_pregunta`),
  CONSTRAINT `FKfwgk3xq9hfhn04749gjbak7ql` FOREIGN KEY (`id_pregunta`) REFERENCES `tb_pregunta` (`idpregunta`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_respuesta`
--

LOCK TABLES `tb_respuesta` WRITE;
/*!40000 ALTER TABLE `tb_respuesta` DISABLE KEYS */;
INSERT INTO `tb_respuesta` VALUES (1,'debes crear tu repositorio primero y seguir los pasos','2023-01-07',1),(2,'puedes ver un video hay varios en youtube te explican bien.','2023-01-07',1),(3,'maven tiene su pagina oficial. ','2023-01-07',2),(4,'hoy en día es más recomendable usar kotlin que java.','2023-01-07',3),(5,'te recomendaría usar la versión de java 11.','2023-01-07',4),(6,'ambos son necesarios para que aplicación web este hermosa.','2023-01-07',5),(7,'kotlin de ley, ya que encontrarás mas soporte  o soluciones para tu aplicación.','2023-01-07',3),(8,'java 11, porque si usas la versión de java 17 tendrás algunos problemas.','2023-01-07',4);
/*!40000 ALTER TABLE `tb_respuesta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'bit2bit'
--

--
-- Dumping routines for database 'bit2bit'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-01-07  0:19:49
