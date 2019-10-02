FROM  jboss/keycloak
## THEME FOLDER 
ADD ${KEYCLOAK_DEFAULT_THEME} /opt/jboss/keycloak/themes/${KEYCLOAK_DEFAULT_THEME}
