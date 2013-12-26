CREATE TABLE EVES_HR.ACCOUNT
(
  ID                 CHAR(10)                 NOT NULL,
  CREATEDDATE        TIMESTAMP(6),
  MODIFIEDDATE       TIMESTAMP(6),
  USERNAME           VARCHAR2(255 CHAR) NOT NULL,
  PASSWORD           VARCHAR2(255 CHAR) NOT NULL,
  MODIFIEDBYUSER_ID   CHAR(10),
  CREATEDBYUSER_ID    CHAR(10),
  SECCODE            VARCHAR2(255 CHAR)
)
TABLESPACE USERS
PCTUSED    0
PCTFREE    10
INITRANS   1
MAXTRANS   255
STORAGE    (
            INITIAL          64K
            NEXT             1M
            MINEXTENTS       1
            MAXEXTENTS       UNLIMITED
            PCTINCREASE      0
            BUFFER_POOL      DEFAULT
           )
LOGGING 
NOCOMPRESS 
NOCACHE
NOPARALLEL
MONITORING;


ALTER TABLE EVES_HR.ACCOUNT ADD (
  PRIMARY KEY
  (ID)
  USING INDEX
    TABLESPACE USERS
    PCTFREE    10
    INITRANS   2
    MAXTRANS   255
    STORAGE    (
                INITIAL          64K
                NEXT             1M
                MINEXTENTS       1
                MAXEXTENTS       UNLIMITED
                PCTINCREASE      0
               ));