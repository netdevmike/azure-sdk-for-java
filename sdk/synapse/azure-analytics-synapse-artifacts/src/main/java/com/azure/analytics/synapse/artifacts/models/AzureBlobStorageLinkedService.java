// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** The azure blob storage linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureBlobStorage")
@JsonFlatten
@Fluent
public class AzureBlobStorageLinkedService extends LinkedService {
    /*
     * The connection string. It is mutually exclusive with sasUri, serviceEndpoint property. Type: string,
     * SecureString or AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "typeProperties.connectionString")
    private Object connectionString;

    /*
     * The Azure key vault secret reference of accountKey in connection string.
     */
    @JsonProperty(value = "typeProperties.accountKey")
    private AzureKeyVaultSecretReference accountKey;

    /*
     * SAS URI of the Azure Blob Storage resource. It is mutually exclusive with connectionString, serviceEndpoint
     * property. Type: string, SecureString or AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "typeProperties.sasUri")
    private Object sasUri;

    /*
     * The Azure key vault secret reference of sasToken in sas uri.
     */
    @JsonProperty(value = "typeProperties.sasToken")
    private AzureKeyVaultSecretReference sasToken;

    /*
     * Blob service endpoint of the Azure Blob Storage resource. It is mutually exclusive with connectionString, sasUri
     * property.
     */
    @JsonProperty(value = "typeProperties.serviceEndpoint")
    private String serviceEndpoint;

    /*
     * The ID of the service principal used to authenticate against Azure SQL Data Warehouse. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalId")
    private Object servicePrincipalId;

    /*
     * The key of the service principal used to authenticate against Azure SQL Data Warehouse.
     */
    @JsonProperty(value = "typeProperties.servicePrincipalKey")
    private SecretBase servicePrincipalKey;

    /*
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.tenant")
    private Object tenant;

    /*
     * Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina,
     * AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.azureCloudType")
    private Object azureCloudType;

    /*
     * Specify the kind of your storage account. Allowed values are: Storage (general purpose v1), StorageV2 (general
     * purpose v2), BlobStorage, or BlockBlobStorage. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.accountKind")
    private String accountKind;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private String encryptedCredential;

    /**
     * Get the connectionString property: The connection string. It is mutually exclusive with sasUri, serviceEndpoint
     * property. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @return the connectionString value.
     */
    public Object getConnectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string. It is mutually exclusive with sasUri, serviceEndpoint
     * property. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @param connectionString the connectionString value to set.
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService setConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the accountKey property: The Azure key vault secret reference of accountKey in connection string.
     *
     * @return the accountKey value.
     */
    public AzureKeyVaultSecretReference getAccountKey() {
        return this.accountKey;
    }

    /**
     * Set the accountKey property: The Azure key vault secret reference of accountKey in connection string.
     *
     * @param accountKey the accountKey value to set.
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService setAccountKey(AzureKeyVaultSecretReference accountKey) {
        this.accountKey = accountKey;
        return this;
    }

    /**
     * Get the sasUri property: SAS URI of the Azure Blob Storage resource. It is mutually exclusive with
     * connectionString, serviceEndpoint property. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @return the sasUri value.
     */
    public Object getSasUri() {
        return this.sasUri;
    }

    /**
     * Set the sasUri property: SAS URI of the Azure Blob Storage resource. It is mutually exclusive with
     * connectionString, serviceEndpoint property. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @param sasUri the sasUri value to set.
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService setSasUri(Object sasUri) {
        this.sasUri = sasUri;
        return this;
    }

    /**
     * Get the sasToken property: The Azure key vault secret reference of sasToken in sas uri.
     *
     * @return the sasToken value.
     */
    public AzureKeyVaultSecretReference getSasToken() {
        return this.sasToken;
    }

    /**
     * Set the sasToken property: The Azure key vault secret reference of sasToken in sas uri.
     *
     * @param sasToken the sasToken value to set.
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService setSasToken(AzureKeyVaultSecretReference sasToken) {
        this.sasToken = sasToken;
        return this;
    }

    /**
     * Get the serviceEndpoint property: Blob service endpoint of the Azure Blob Storage resource. It is mutually
     * exclusive with connectionString, sasUri property.
     *
     * @return the serviceEndpoint value.
     */
    public String getServiceEndpoint() {
        return this.serviceEndpoint;
    }

    /**
     * Set the serviceEndpoint property: Blob service endpoint of the Azure Blob Storage resource. It is mutually
     * exclusive with connectionString, sasUri property.
     *
     * @param serviceEndpoint the serviceEndpoint value to set.
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService setServiceEndpoint(String serviceEndpoint) {
        this.serviceEndpoint = serviceEndpoint;
        return this;
    }

    /**
     * Get the servicePrincipalId property: The ID of the service principal used to authenticate against Azure SQL Data
     * Warehouse. Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalId value.
     */
    public Object getServicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: The ID of the service principal used to authenticate against Azure SQL Data
     * Warehouse. Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService setServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalKey property: The key of the service principal used to authenticate against Azure SQL
     * Data Warehouse.
     *
     * @return the servicePrincipalKey value.
     */
    public SecretBase getServicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey property: The key of the service principal used to authenticate against Azure SQL
     * Data Warehouse.
     *
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService setServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     *
     * @return the tenant value.
     */
    public Object getTenant() {
        return this.tenant;
    }

    /**
     * Set the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     *
     * @param tenant the tenant value to set.
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService setTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get the azureCloudType property: Indicates the azure cloud type of the service principle auth. Allowed values are
     * AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type.
     * Type: string (or Expression with resultType string).
     *
     * @return the azureCloudType value.
     */
    public Object getAzureCloudType() {
        return this.azureCloudType;
    }

    /**
     * Set the azureCloudType property: Indicates the azure cloud type of the service principle auth. Allowed values are
     * AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type.
     * Type: string (or Expression with resultType string).
     *
     * @param azureCloudType the azureCloudType value to set.
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService setAzureCloudType(Object azureCloudType) {
        this.azureCloudType = azureCloudType;
        return this;
    }

    /**
     * Get the accountKind property: Specify the kind of your storage account. Allowed values are: Storage (general
     * purpose v1), StorageV2 (general purpose v2), BlobStorage, or BlockBlobStorage. Type: string (or Expression with
     * resultType string).
     *
     * @return the accountKind value.
     */
    public String getAccountKind() {
        return this.accountKind;
    }

    /**
     * Set the accountKind property: Specify the kind of your storage account. Allowed values are: Storage (general
     * purpose v1), StorageV2 (general purpose v2), BlobStorage, or BlockBlobStorage. Type: string (or Expression with
     * resultType string).
     *
     * @param accountKind the accountKind value to set.
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService setAccountKind(String accountKind) {
        this.accountKind = accountKind;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public String getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService setEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobStorageLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobStorageLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobStorageLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobStorageLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }
}
