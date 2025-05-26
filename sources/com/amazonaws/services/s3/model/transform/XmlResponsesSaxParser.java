package com.amazonaws.services.s3.model.transform;

import a.a;
import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.internal.DeleteObjectsResponse;
import com.amazonaws.services.s3.internal.ObjectExpirationResult;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.s3.internal.S3VersionResult;
import com.amazonaws.services.s3.internal.ServiceUtils;
import com.amazonaws.services.s3.model.AbortIncompleteMultipartUpload;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.BucketAccelerateConfiguration;
import com.amazonaws.services.s3.model.BucketCrossOriginConfiguration;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration;
import com.amazonaws.services.s3.model.BucketLoggingConfiguration;
import com.amazonaws.services.s3.model.BucketReplicationConfiguration;
import com.amazonaws.services.s3.model.BucketTaggingConfiguration;
import com.amazonaws.services.s3.model.BucketVersioningConfiguration;
import com.amazonaws.services.s3.model.BucketWebsiteConfiguration;
import com.amazonaws.services.s3.model.CORSRule;
import com.amazonaws.services.s3.model.CanonicalGrantee;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.CopyObjectResult;
import com.amazonaws.services.s3.model.DeleteObjectsResult$DeletedObject;
import com.amazonaws.services.s3.model.EmailAddressGrantee;
import com.amazonaws.services.s3.model.GetBucketInventoryConfigurationResult;
import com.amazonaws.services.s3.model.Grant;
import com.amazonaws.services.s3.model.Grantee;
import com.amazonaws.services.s3.model.GroupGrantee;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.ListBucketAnalyticsConfigurationsResult;
import com.amazonaws.services.s3.model.ListBucketInventoryConfigurationsResult;
import com.amazonaws.services.s3.model.ListBucketMetricsConfigurationsResult;
import com.amazonaws.services.s3.model.MultiObjectDeleteException;
import com.amazonaws.services.s3.model.MultipartUpload;
import com.amazonaws.services.s3.model.MultipartUploadListing;
import com.amazonaws.services.s3.model.Owner;
import com.amazonaws.services.s3.model.PartListing;
import com.amazonaws.services.s3.model.PartSummary;
import com.amazonaws.services.s3.model.Permission;
import com.amazonaws.services.s3.model.RedirectRule;
import com.amazonaws.services.s3.model.ReplicationDestinationConfig;
import com.amazonaws.services.s3.model.ReplicationRule;
import com.amazonaws.services.s3.model.RoutingRule;
import com.amazonaws.services.s3.model.RoutingRuleCondition;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.amazonaws.services.s3.model.S3VersionSummary;
import com.amazonaws.services.s3.model.Tag;
import com.amazonaws.services.s3.model.TagSet;
import com.amazonaws.services.s3.model.analytics.AnalyticsAndOperator;
import com.amazonaws.services.s3.model.analytics.AnalyticsConfiguration;
import com.amazonaws.services.s3.model.analytics.AnalyticsExportDestination;
import com.amazonaws.services.s3.model.analytics.AnalyticsFilter;
import com.amazonaws.services.s3.model.analytics.AnalyticsPrefixPredicate;
import com.amazonaws.services.s3.model.analytics.AnalyticsS3BucketDestination;
import com.amazonaws.services.s3.model.analytics.AnalyticsTagPredicate;
import com.amazonaws.services.s3.model.analytics.StorageClassAnalysis;
import com.amazonaws.services.s3.model.analytics.StorageClassAnalysisDataExport;
import com.amazonaws.services.s3.model.inventory.InventoryConfiguration;
import com.amazonaws.services.s3.model.inventory.InventoryDestination;
import com.amazonaws.services.s3.model.inventory.InventoryFilter;
import com.amazonaws.services.s3.model.inventory.InventoryPrefixPredicate;
import com.amazonaws.services.s3.model.inventory.InventoryS3BucketDestination;
import com.amazonaws.services.s3.model.inventory.InventorySchedule;
import com.amazonaws.services.s3.model.lifecycle.LifecycleAndOperator;
import com.amazonaws.services.s3.model.lifecycle.LifecycleFilter;
import com.amazonaws.services.s3.model.lifecycle.LifecyclePrefixPredicate;
import com.amazonaws.services.s3.model.lifecycle.LifecycleTagPredicate;
import com.amazonaws.services.s3.model.metrics.MetricsAndOperator;
import com.amazonaws.services.s3.model.metrics.MetricsConfiguration;
import com.amazonaws.services.s3.model.metrics.MetricsFilter;
import com.amazonaws.services.s3.model.metrics.MetricsPrefixPredicate;
import com.amazonaws.services.s3.model.metrics.MetricsTagPredicate;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

/* loaded from: classes3.dex */
public class XmlResponsesSaxParser {

    /* renamed from: b, reason: collision with root package name */
    public static final Log f28932b = LogFactory.a(XmlResponsesSaxParser.class);

    /* renamed from: a, reason: collision with root package name */
    public final XMLReader f28933a;

    public static class AccessControlListHandler extends AbstractHandler {

        /* renamed from: c, reason: collision with root package name */
        public final AccessControlList f28934c = new AccessControlList();

        /* renamed from: d, reason: collision with root package name */
        public Grantee f28935d = null;

        /* renamed from: e, reason: collision with root package name */
        public Permission f28936e = null;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void e(String str) {
            boolean j13 = j("AccessControlPolicy", "Owner");
            AccessControlList accessControlList = this.f28934c;
            StringBuilder sb3 = this.f28930a;
            if (j13) {
                if (str.equals("ID")) {
                    accessControlList.f28845c.f28895b = sb3.toString();
                    return;
                } else {
                    if (str.equals("DisplayName")) {
                        accessControlList.f28845c.f28894a = sb3.toString();
                        return;
                    }
                    return;
                }
            }
            if (j("AccessControlPolicy", "AccessControlList")) {
                if (str.equals("Grant")) {
                    Grantee grantee = this.f28935d;
                    Permission permission = this.f28936e;
                    List a13 = accessControlList.a();
                    Grant grant = new Grant();
                    grant.f28873a = grantee;
                    grant.f28874b = permission;
                    ((LinkedList) a13).add(grant);
                    this.f28935d = null;
                    this.f28936e = null;
                    return;
                }
                return;
            }
            if (j("AccessControlPolicy", "AccessControlList", "Grant")) {
                if (str.equals("Permission")) {
                    this.f28936e = Permission.parsePermission(sb3.toString());
                    return;
                }
                return;
            }
            if (j("AccessControlPolicy", "AccessControlList", "Grant", "Grantee")) {
                if (str.equals("ID")) {
                    this.f28935d.setIdentifier(sb3.toString());
                    return;
                }
                if (str.equals("EmailAddress")) {
                    this.f28935d.setIdentifier(sb3.toString());
                    return;
                }
                if (str.equals("URI")) {
                    this.f28935d = GroupGrantee.parseGroupGrantee(sb3.toString());
                } else if (str.equals("DisplayName")) {
                    CanonicalGrantee canonicalGrantee = (CanonicalGrantee) this.f28935d;
                    sb3.getClass();
                    canonicalGrantee.getClass();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void f(String str, Attributes attributes) {
            String str2;
            if (j("AccessControlPolicy")) {
                if (str.equals("Owner")) {
                    this.f28934c.f28845c = new Owner();
                    return;
                }
                return;
            }
            if (j("AccessControlPolicy", "AccessControlList", "Grant") && str.equals("Grantee")) {
                Log log = XmlResponsesSaxParser.f28932b;
                Charset charset = StringUtils.f29048a;
                int i13 = 0;
                while (true) {
                    if (i13 >= 8) {
                        break;
                    }
                    if (Character.isWhitespace("xsi:type".charAt(i13))) {
                        i13++;
                    } else if (attributes != null) {
                        for (int i14 = 0; i14 < attributes.getLength(); i14++) {
                            if (attributes.getQName(i14).trim().equalsIgnoreCase("xsi:type")) {
                                str2 = attributes.getValue(i14);
                                break;
                            }
                        }
                    }
                }
                str2 = null;
                if ("AmazonCustomerByEmail".equals(str2)) {
                    EmailAddressGrantee emailAddressGrantee = new EmailAddressGrantee();
                    emailAddressGrantee.f28866a = null;
                    this.f28935d = emailAddressGrantee;
                } else {
                    if (!"CanonicalUser".equals(str2)) {
                        "Group".equals(str2);
                        return;
                    }
                    CanonicalGrantee canonicalGrantee = new CanonicalGrantee();
                    canonicalGrantee.f28864a = null;
                    this.f28935d = canonicalGrantee;
                }
            }
        }
    }

    public static class BucketAccelerateConfigurationHandler extends AbstractHandler {

        /* renamed from: c, reason: collision with root package name */
        public final BucketAccelerateConfiguration f28937c = new BucketAccelerateConfiguration();

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void e(String str) {
            if (j("AccelerateConfiguration") && str.equals("Status")) {
                this.f28930a.getClass();
                this.f28937c.getClass();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void f(String str, Attributes attributes) {
        }
    }

    public static class BucketCrossOriginConfigurationHandler extends AbstractHandler {

        /* renamed from: c, reason: collision with root package name */
        public final BucketCrossOriginConfiguration f28938c;

        /* renamed from: d, reason: collision with root package name */
        public CORSRule f28939d;

        /* renamed from: e, reason: collision with root package name */
        public ArrayList f28940e;

        /* renamed from: f, reason: collision with root package name */
        public ArrayList f28941f;

        /* renamed from: g, reason: collision with root package name */
        public ArrayList f28942g;

        /* renamed from: h, reason: collision with root package name */
        public LinkedList f28943h;

        public BucketCrossOriginConfigurationHandler() {
            ArrayList arrayList = new ArrayList();
            BucketCrossOriginConfiguration bucketCrossOriginConfiguration = new BucketCrossOriginConfiguration();
            bucketCrossOriginConfiguration.f28851a = arrayList;
            this.f28938c = bucketCrossOriginConfiguration;
            this.f28940e = null;
            this.f28941f = null;
            this.f28942g = null;
            this.f28943h = null;
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void e(String str) {
            if (j("CORSConfiguration")) {
                if (str.equals("CORSRule")) {
                    CORSRule cORSRule = this.f28939d;
                    cORSRule.f28863d = this.f28943h;
                    cORSRule.f28860a = this.f28940e;
                    cORSRule.f28861b = this.f28941f;
                    cORSRule.f28862c = this.f28942g;
                    this.f28943h = null;
                    this.f28940e = null;
                    this.f28941f = null;
                    this.f28942g = null;
                    this.f28938c.f28851a.add(cORSRule);
                    this.f28939d = null;
                    return;
                }
                return;
            }
            if (j("CORSConfiguration", "CORSRule")) {
                boolean equals = str.equals("ID");
                StringBuilder sb3 = this.f28930a;
                if (equals) {
                    CORSRule cORSRule2 = this.f28939d;
                    sb3.getClass();
                    cORSRule2.getClass();
                    return;
                }
                if (str.equals("AllowedOrigin")) {
                    this.f28941f.add(sb3.toString());
                    return;
                }
                if (str.equals("AllowedMethod")) {
                    this.f28940e.add(CORSRule.AllowedMethods.fromValue(sb3.toString()));
                    return;
                }
                if (str.equals("MaxAgeSeconds")) {
                    CORSRule cORSRule3 = this.f28939d;
                    Integer.parseInt(sb3.toString());
                    cORSRule3.getClass();
                } else if (str.equals("ExposeHeader")) {
                    this.f28942g.add(sb3.toString());
                } else if (str.equals("AllowedHeader")) {
                    this.f28943h.add(sb3.toString());
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void f(String str, Attributes attributes) {
            if (j("CORSConfiguration")) {
                if (str.equals("CORSRule")) {
                    this.f28939d = new CORSRule();
                    return;
                }
                return;
            }
            if (j("CORSConfiguration", "CORSRule")) {
                if (str.equals("AllowedOrigin")) {
                    if (this.f28941f == null) {
                        this.f28941f = new ArrayList();
                    }
                } else if (str.equals("AllowedMethod")) {
                    if (this.f28940e == null) {
                        this.f28940e = new ArrayList();
                    }
                } else if (str.equals("ExposeHeader")) {
                    if (this.f28942g == null) {
                        this.f28942g = new ArrayList();
                    }
                } else if (str.equals("AllowedHeader") && this.f28943h == null) {
                    this.f28943h = new LinkedList();
                }
            }
        }
    }

    public static class BucketLifecycleConfigurationHandler extends AbstractHandler {

        /* renamed from: c, reason: collision with root package name */
        public final BucketLifecycleConfiguration f28944c;

        /* renamed from: d, reason: collision with root package name */
        public BucketLifecycleConfiguration.Rule f28945d;

        /* renamed from: e, reason: collision with root package name */
        public BucketLifecycleConfiguration.Transition f28946e;

        /* renamed from: f, reason: collision with root package name */
        public BucketLifecycleConfiguration.NoncurrentVersionTransition f28947f;

        /* renamed from: g, reason: collision with root package name */
        public AbortIncompleteMultipartUpload f28948g;

        /* renamed from: h, reason: collision with root package name */
        public LifecycleFilter f28949h;

        /* renamed from: i, reason: collision with root package name */
        public ArrayList f28950i;

        public BucketLifecycleConfigurationHandler() {
            ArrayList arrayList = new ArrayList();
            BucketLifecycleConfiguration bucketLifecycleConfiguration = new BucketLifecycleConfiguration();
            bucketLifecycleConfiguration.f28852a = arrayList;
            this.f28944c = bucketLifecycleConfiguration;
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void e(String str) {
            if (j("LifecycleConfiguration")) {
                if (str.equals("Rule")) {
                    this.f28944c.f28852a.add(this.f28945d);
                    this.f28945d = null;
                    return;
                }
                return;
            }
            boolean j13 = j("LifecycleConfiguration", "Rule");
            StringBuilder sb3 = this.f28930a;
            if (j13) {
                if (str.equals("ID")) {
                    BucketLifecycleConfiguration.Rule rule = this.f28945d;
                    sb3.getClass();
                    rule.getClass();
                    return;
                }
                if (str.equals("Prefix")) {
                    BucketLifecycleConfiguration.Rule rule2 = this.f28945d;
                    sb3.getClass();
                    rule2.getClass();
                    return;
                }
                if (str.equals("Status")) {
                    BucketLifecycleConfiguration.Rule rule3 = this.f28945d;
                    sb3.getClass();
                    rule3.getClass();
                    return;
                }
                if (str.equals("Transition")) {
                    BucketLifecycleConfiguration.Rule rule4 = this.f28945d;
                    BucketLifecycleConfiguration.Transition transition = this.f28946e;
                    if (transition == null) {
                        rule4.getClass();
                        throw new IllegalArgumentException("Transition cannot be null.");
                    }
                    if (rule4.f28853a == null) {
                        rule4.f28853a = new ArrayList();
                    }
                    rule4.f28853a.add(transition);
                    this.f28946e = null;
                    return;
                }
                if (!str.equals("NoncurrentVersionTransition")) {
                    if (str.equals("AbortIncompleteMultipartUpload")) {
                        this.f28945d.getClass();
                        this.f28948g = null;
                        return;
                    } else {
                        if (str.equals("Filter")) {
                            this.f28945d.getClass();
                            this.f28949h = null;
                            return;
                        }
                        return;
                    }
                }
                BucketLifecycleConfiguration.Rule rule5 = this.f28945d;
                BucketLifecycleConfiguration.NoncurrentVersionTransition noncurrentVersionTransition = this.f28947f;
                if (noncurrentVersionTransition == null) {
                    rule5.getClass();
                    throw new IllegalArgumentException("NoncurrentVersionTransition cannot be null.");
                }
                if (rule5.f28854b == null) {
                    rule5.f28854b = new ArrayList();
                }
                rule5.f28854b.add(noncurrentVersionTransition);
                this.f28947f = null;
                return;
            }
            if (j("LifecycleConfiguration", "Rule", "Expiration")) {
                if (str.equals("Date")) {
                    BucketLifecycleConfiguration.Rule rule6 = this.f28945d;
                    String sb4 = sb3.toString();
                    int i13 = ServiceUtils.f28822a;
                    DateUtils.e(sb4);
                    rule6.getClass();
                    return;
                }
                if (str.equals("Days")) {
                    BucketLifecycleConfiguration.Rule rule7 = this.f28945d;
                    Integer.parseInt(sb3.toString());
                    rule7.getClass();
                    return;
                } else {
                    if (str.equals("ExpiredObjectDeleteMarker") && "true".equals(sb3.toString())) {
                        this.f28945d.getClass();
                        return;
                    }
                    return;
                }
            }
            if (j("LifecycleConfiguration", "Rule", "Transition")) {
                if (str.equals("StorageClass")) {
                    BucketLifecycleConfiguration.Transition transition2 = this.f28946e;
                    sb3.getClass();
                    transition2.getClass();
                    return;
                } else {
                    if (str.equals("Date")) {
                        BucketLifecycleConfiguration.Transition transition3 = this.f28946e;
                        String sb5 = sb3.toString();
                        int i14 = ServiceUtils.f28822a;
                        DateUtils.e(sb5);
                        transition3.getClass();
                        return;
                    }
                    if (str.equals("Days")) {
                        BucketLifecycleConfiguration.Transition transition4 = this.f28946e;
                        Integer.parseInt(sb3.toString());
                        transition4.getClass();
                        return;
                    }
                    return;
                }
            }
            if (j("LifecycleConfiguration", "Rule", "NoncurrentVersionExpiration")) {
                if (str.equals("NoncurrentDays")) {
                    BucketLifecycleConfiguration.Rule rule8 = this.f28945d;
                    Integer.parseInt(sb3.toString());
                    rule8.getClass();
                    return;
                }
                return;
            }
            if (j("LifecycleConfiguration", "Rule", "NoncurrentVersionTransition")) {
                if (str.equals("StorageClass")) {
                    BucketLifecycleConfiguration.NoncurrentVersionTransition noncurrentVersionTransition2 = this.f28947f;
                    sb3.getClass();
                    noncurrentVersionTransition2.getClass();
                    return;
                } else {
                    if (str.equals("NoncurrentDays")) {
                        BucketLifecycleConfiguration.NoncurrentVersionTransition noncurrentVersionTransition3 = this.f28947f;
                        Integer.parseInt(sb3.toString());
                        noncurrentVersionTransition3.getClass();
                        return;
                    }
                    return;
                }
            }
            if (j("LifecycleConfiguration", "Rule", "AbortIncompleteMultipartUpload")) {
                if (str.equals("DaysAfterInitiation")) {
                    this.f28948g.f28828a = Integer.parseInt(sb3.toString());
                    return;
                }
                return;
            }
            if (j("LifecycleConfiguration", "Rule", "Filter")) {
                if (str.equals("Prefix")) {
                    LifecycleFilter lifecycleFilter = this.f28949h;
                    sb3.getClass();
                    new LifecyclePrefixPredicate();
                    lifecycleFilter.getClass();
                    return;
                }
                if (str.equals("Tag")) {
                    LifecycleFilter lifecycleFilter2 = this.f28949h;
                    new LifecycleTagPredicate();
                    lifecycleFilter2.getClass();
                    return;
                } else {
                    if (str.equals("And")) {
                        LifecycleFilter lifecycleFilter3 = this.f28949h;
                        new LifecycleAndOperator(this.f28950i);
                        lifecycleFilter3.getClass();
                        this.f28950i = null;
                        return;
                    }
                    return;
                }
            }
            if (j("LifecycleConfiguration", "Rule", "Filter", "Tag")) {
                if (str.equals("Key")) {
                    sb3.getClass();
                    return;
                } else {
                    if (str.equals("Value")) {
                        sb3.getClass();
                        return;
                    }
                    return;
                }
            }
            if (j("LifecycleConfiguration", "Rule", "Filter", "And")) {
                if (str.equals("Prefix")) {
                    ArrayList arrayList = this.f28950i;
                    sb3.getClass();
                    arrayList.add(new LifecyclePrefixPredicate());
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f28950i.add(new LifecycleTagPredicate());
                        return;
                    }
                    return;
                }
            }
            if (j("LifecycleConfiguration", "Rule", "Filter", "And", "Tag")) {
                if (str.equals("Key")) {
                    sb3.getClass();
                } else if (str.equals("Value")) {
                    sb3.getClass();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void f(String str, Attributes attributes) {
            if (j("LifecycleConfiguration")) {
                if (str.equals("Rule")) {
                    this.f28945d = new BucketLifecycleConfiguration.Rule();
                    return;
                }
                return;
            }
            if (!j("LifecycleConfiguration", "Rule")) {
                if (j("LifecycleConfiguration", "Rule", "Filter") && str.equals("And")) {
                    this.f28950i = new ArrayList();
                    return;
                }
                return;
            }
            if (str.equals("Transition")) {
                this.f28946e = new BucketLifecycleConfiguration.Transition();
                return;
            }
            if (str.equals("NoncurrentVersionTransition")) {
                this.f28947f = new BucketLifecycleConfiguration.NoncurrentVersionTransition();
            } else if (str.equals("AbortIncompleteMultipartUpload")) {
                this.f28948g = new AbortIncompleteMultipartUpload();
            } else if (str.equals("Filter")) {
                this.f28949h = new LifecycleFilter();
            }
        }
    }

    public static class BucketLocationHandler extends AbstractHandler {
        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void e(String str) {
            if (this.f28931b.isEmpty() && str.equals("LocationConstraint")) {
                this.f28930a.toString().getClass();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void f(String str, Attributes attributes) {
        }
    }

    public static class BucketLoggingConfigurationHandler extends AbstractHandler {

        /* renamed from: c, reason: collision with root package name */
        public final BucketLoggingConfiguration f28951c = new BucketLoggingConfiguration();

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void e(String str) {
            if (j("BucketLoggingStatus", "LoggingEnabled")) {
                boolean equals = str.equals("TargetBucket");
                StringBuilder sb3 = this.f28930a;
                BucketLoggingConfiguration bucketLoggingConfiguration = this.f28951c;
                if (equals) {
                    bucketLoggingConfiguration.f28855a = sb3.toString();
                    return;
                }
                if (str.equals("TargetPrefix")) {
                    String sb4 = sb3.toString();
                    bucketLoggingConfiguration.getClass();
                    if (sb4 == null) {
                        sb4 = "";
                    }
                    bucketLoggingConfiguration.f28856b = sb4;
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void f(String str, Attributes attributes) {
        }
    }

    public static class BucketReplicationConfigurationHandler extends AbstractHandler {

        /* renamed from: c, reason: collision with root package name */
        public final BucketReplicationConfiguration f28952c = new BucketReplicationConfiguration();

        /* renamed from: d, reason: collision with root package name */
        public String f28953d;

        /* renamed from: e, reason: collision with root package name */
        public ReplicationRule f28954e;

        /* renamed from: f, reason: collision with root package name */
        public ReplicationDestinationConfig f28955f;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void e(String str) {
            boolean j13 = j("ReplicationConfiguration");
            StringBuilder sb3 = this.f28930a;
            if (j13) {
                boolean equals = str.equals("Rule");
                BucketReplicationConfiguration bucketReplicationConfiguration = this.f28952c;
                if (!equals) {
                    if (str.equals("Role")) {
                        sb3.getClass();
                        bucketReplicationConfiguration.getClass();
                        return;
                    }
                    return;
                }
                String str2 = this.f28953d;
                ReplicationRule replicationRule = this.f28954e;
                bucketReplicationConfiguration.getClass();
                if (str2 == null || str2.trim().isEmpty()) {
                    throw new IllegalArgumentException("Rule id cannot be null or empty.");
                }
                if (replicationRule == null) {
                    throw new IllegalArgumentException("Replication rule cannot be null");
                }
                bucketReplicationConfiguration.f28857a.put(str2, replicationRule);
                this.f28954e = null;
                this.f28953d = null;
                this.f28955f = null;
                return;
            }
            if (!j("ReplicationConfiguration", "Rule")) {
                if (j("ReplicationConfiguration", "Rule", "Destination")) {
                    if (str.equals("Bucket")) {
                        ReplicationDestinationConfig replicationDestinationConfig = this.f28955f;
                        String sb4 = sb3.toString();
                        replicationDestinationConfig.getClass();
                        if (sb4 == null) {
                            throw new IllegalArgumentException("Bucket name cannot be null");
                        }
                        return;
                    }
                    if (str.equals("StorageClass")) {
                        ReplicationDestinationConfig replicationDestinationConfig2 = this.f28955f;
                        sb3.getClass();
                        replicationDestinationConfig2.getClass();
                        return;
                    }
                    return;
                }
                return;
            }
            if (str.equals("ID")) {
                this.f28953d = sb3.toString();
                return;
            }
            if (str.equals("Prefix")) {
                ReplicationRule replicationRule2 = this.f28954e;
                String sb5 = sb3.toString();
                replicationRule2.getClass();
                if (sb5 == null) {
                    throw new IllegalArgumentException("Prefix cannot be null for a replication rule");
                }
                return;
            }
            if (str.equals("Status")) {
                ReplicationRule replicationRule3 = this.f28954e;
                sb3.getClass();
                replicationRule3.getClass();
            } else if (str.equals("Destination")) {
                ReplicationRule replicationRule4 = this.f28954e;
                ReplicationDestinationConfig replicationDestinationConfig3 = this.f28955f;
                replicationRule4.getClass();
                if (replicationDestinationConfig3 == null) {
                    throw new IllegalArgumentException("Destination cannot be null in the replication rule");
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void f(String str, Attributes attributes) {
            if (j("ReplicationConfiguration")) {
                if (str.equals("Rule")) {
                    this.f28954e = new ReplicationRule();
                }
            } else if (j("ReplicationConfiguration", "Rule") && str.equals("Destination")) {
                this.f28955f = new ReplicationDestinationConfig();
            }
        }
    }

    public static class BucketTaggingConfigurationHandler extends AbstractHandler {

        /* renamed from: c, reason: collision with root package name */
        public final BucketTaggingConfiguration f28956c = new BucketTaggingConfiguration();

        /* renamed from: d, reason: collision with root package name */
        public HashMap f28957d;

        /* renamed from: e, reason: collision with root package name */
        public String f28958e;

        /* renamed from: f, reason: collision with root package name */
        public String f28959f;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void e(String str) {
            String str2;
            if (j("Tagging")) {
                if (str.equals("TagSet")) {
                    ArrayList arrayList = this.f28956c.f28858a;
                    HashMap hashMap = this.f28957d;
                    TagSet tagSet = new TagSet();
                    HashMap hashMap2 = new HashMap(1);
                    tagSet.f28916a = hashMap2;
                    hashMap2.putAll(hashMap);
                    arrayList.add(tagSet);
                    this.f28957d = null;
                    return;
                }
                return;
            }
            if (j("Tagging", "TagSet")) {
                if (str.equals("Tag")) {
                    String str3 = this.f28958e;
                    if (str3 != null && (str2 = this.f28959f) != null) {
                        this.f28957d.put(str3, str2);
                    }
                    this.f28958e = null;
                    this.f28959f = null;
                    return;
                }
                return;
            }
            if (j("Tagging", "TagSet", "Tag")) {
                boolean equals = str.equals("Key");
                StringBuilder sb3 = this.f28930a;
                if (equals) {
                    this.f28958e = sb3.toString();
                } else if (str.equals("Value")) {
                    this.f28959f = sb3.toString();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void f(String str, Attributes attributes) {
            if (j("Tagging") && str.equals("TagSet")) {
                this.f28957d = new HashMap();
            }
        }
    }

    public static class BucketVersioningConfigurationHandler extends AbstractHandler {

        /* renamed from: c, reason: collision with root package name */
        public final BucketVersioningConfiguration f28960c = new BucketVersioningConfiguration();

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void e(String str) {
            if (j("VersioningConfiguration")) {
                boolean equals = str.equals("Status");
                StringBuilder sb3 = this.f28930a;
                BucketVersioningConfiguration bucketVersioningConfiguration = this.f28960c;
                if (equals) {
                    sb3.getClass();
                    bucketVersioningConfiguration.getClass();
                } else if (str.equals("MfaDelete")) {
                    String sb4 = sb3.toString();
                    if (sb4.equals("Disabled")) {
                        bucketVersioningConfiguration.getClass();
                    } else if (sb4.equals("Enabled")) {
                        bucketVersioningConfiguration.getClass();
                    } else {
                        bucketVersioningConfiguration.getClass();
                    }
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void f(String str, Attributes attributes) {
        }
    }

    public static class BucketWebsiteConfigurationHandler extends AbstractHandler {

        /* renamed from: c, reason: collision with root package name */
        public final BucketWebsiteConfiguration f28961c;

        /* renamed from: d, reason: collision with root package name */
        public RoutingRuleCondition f28962d;

        /* renamed from: e, reason: collision with root package name */
        public RedirectRule f28963e;

        /* renamed from: f, reason: collision with root package name */
        public RoutingRule f28964f;

        public BucketWebsiteConfigurationHandler() {
            BucketWebsiteConfiguration bucketWebsiteConfiguration = new BucketWebsiteConfiguration();
            bucketWebsiteConfiguration.f28859a = new LinkedList();
            this.f28961c = bucketWebsiteConfiguration;
            this.f28962d = null;
            this.f28963e = null;
            this.f28964f = null;
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void e(String str) {
            boolean j13 = j("WebsiteConfiguration");
            BucketWebsiteConfiguration bucketWebsiteConfiguration = this.f28961c;
            if (j13) {
                if (str.equals("RedirectAllRequestsTo")) {
                    bucketWebsiteConfiguration.getClass();
                    this.f28963e = null;
                    return;
                }
                return;
            }
            boolean j14 = j("WebsiteConfiguration", "IndexDocument");
            StringBuilder sb3 = this.f28930a;
            if (j14) {
                if (str.equals("Suffix")) {
                    sb3.getClass();
                    bucketWebsiteConfiguration.getClass();
                    return;
                }
                return;
            }
            if (j("WebsiteConfiguration", "ErrorDocument")) {
                if (str.equals("Key")) {
                    sb3.getClass();
                    bucketWebsiteConfiguration.getClass();
                    return;
                }
                return;
            }
            if (j("WebsiteConfiguration", "RoutingRules")) {
                if (str.equals("RoutingRule")) {
                    bucketWebsiteConfiguration.f28859a.add(this.f28964f);
                    this.f28964f = null;
                    return;
                }
                return;
            }
            if (j("WebsiteConfiguration", "RoutingRules", "RoutingRule")) {
                if (str.equals("Condition")) {
                    this.f28964f.getClass();
                    this.f28962d = null;
                    return;
                } else {
                    if (str.equals("Redirect")) {
                        this.f28964f.getClass();
                        this.f28963e = null;
                        return;
                    }
                    return;
                }
            }
            if (j("WebsiteConfiguration", "RoutingRules", "RoutingRule", "Condition")) {
                if (str.equals("KeyPrefixEquals")) {
                    RoutingRuleCondition routingRuleCondition = this.f28962d;
                    sb3.getClass();
                    routingRuleCondition.getClass();
                    return;
                } else {
                    if (str.equals("HttpErrorCodeReturnedEquals")) {
                        RoutingRuleCondition routingRuleCondition2 = this.f28962d;
                        sb3.getClass();
                        routingRuleCondition2.getClass();
                        return;
                    }
                    return;
                }
            }
            if (j("WebsiteConfiguration", "RedirectAllRequestsTo") || j("WebsiteConfiguration", "RoutingRules", "RoutingRule", "Redirect")) {
                if (str.equals("Protocol")) {
                    RedirectRule redirectRule = this.f28963e;
                    sb3.getClass();
                    redirectRule.getClass();
                    return;
                }
                if (str.equals("HostName")) {
                    RedirectRule redirectRule2 = this.f28963e;
                    sb3.getClass();
                    redirectRule2.getClass();
                    return;
                }
                if (str.equals("ReplaceKeyPrefixWith")) {
                    RedirectRule redirectRule3 = this.f28963e;
                    sb3.getClass();
                    redirectRule3.getClass();
                } else if (str.equals("ReplaceKeyWith")) {
                    RedirectRule redirectRule4 = this.f28963e;
                    sb3.getClass();
                    redirectRule4.getClass();
                } else if (str.equals("HttpRedirectCode")) {
                    RedirectRule redirectRule5 = this.f28963e;
                    sb3.getClass();
                    redirectRule5.getClass();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void f(String str, Attributes attributes) {
            if (j("WebsiteConfiguration")) {
                if (str.equals("RedirectAllRequestsTo")) {
                    this.f28963e = new RedirectRule();
                }
            } else if (j("WebsiteConfiguration", "RoutingRules")) {
                if (str.equals("RoutingRule")) {
                    this.f28964f = new RoutingRule();
                }
            } else if (j("WebsiteConfiguration", "RoutingRules", "RoutingRule")) {
                if (str.equals("Condition")) {
                    this.f28962d = new RoutingRuleCondition();
                } else if (str.equals("Redirect")) {
                    this.f28963e = new RedirectRule();
                }
            }
        }
    }

    public static class CompleteMultipartUploadHandler extends AbstractSSEHandler implements ObjectExpirationResult, S3VersionResult, S3RequesterChargedResult {

        /* renamed from: c, reason: collision with root package name */
        public CompleteMultipartUploadResult f28965c;

        /* renamed from: d, reason: collision with root package name */
        public AmazonS3Exception f28966d;

        /* renamed from: e, reason: collision with root package name */
        public String f28967e;

        /* renamed from: f, reason: collision with root package name */
        public String f28968f;

        /* renamed from: g, reason: collision with root package name */
        public String f28969g;

        @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
        public final void b(String str) {
            CompleteMultipartUploadResult completeMultipartUploadResult = this.f28965c;
            if (completeMultipartUploadResult != null) {
                completeMultipartUploadResult.getClass();
            }
        }

        @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
        public final void c(boolean z13) {
        }

        @Override // com.amazonaws.services.s3.internal.S3VersionResult
        public final void d() {
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void e(String str) {
            AmazonS3Exception amazonS3Exception;
            if (this.f28931b.isEmpty()) {
                if (!str.equals("Error") || (amazonS3Exception = this.f28966d) == null) {
                    return;
                }
                amazonS3Exception.f28508b = this.f28969g;
                amazonS3Exception.f28507a = this.f28968f;
                amazonS3Exception.f28846f = this.f28967e;
                return;
            }
            boolean j13 = j("CompleteMultipartUploadResult");
            StringBuilder sb3 = this.f28930a;
            if (!j13) {
                if (j("Error")) {
                    if (str.equals("Code")) {
                        this.f28969g = sb3.toString();
                        return;
                    }
                    if (str.equals("Message")) {
                        this.f28966d = new AmazonS3Exception(sb3.toString());
                        return;
                    } else if (str.equals("RequestId")) {
                        this.f28968f = sb3.toString();
                        return;
                    } else {
                        if (str.equals("HostId")) {
                            this.f28967e = sb3.toString();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (str.equals("Location")) {
                CompleteMultipartUploadResult completeMultipartUploadResult = this.f28965c;
                sb3.getClass();
                completeMultipartUploadResult.getClass();
                return;
            }
            if (str.equals("Bucket")) {
                CompleteMultipartUploadResult completeMultipartUploadResult2 = this.f28965c;
                sb3.getClass();
                completeMultipartUploadResult2.getClass();
            } else if (str.equals("Key")) {
                CompleteMultipartUploadResult completeMultipartUploadResult3 = this.f28965c;
                sb3.getClass();
                completeMultipartUploadResult3.getClass();
            } else if (str.equals("ETag")) {
                CompleteMultipartUploadResult completeMultipartUploadResult4 = this.f28965c;
                ServiceUtils.a(sb3.toString());
                completeMultipartUploadResult4.getClass();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void f(String str, Attributes attributes) {
            if (this.f28931b.isEmpty() && str.equals("CompleteMultipartUploadResult")) {
                this.f28965c = new CompleteMultipartUploadResult();
            }
        }

        @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
        public final void g(Date date) {
            CompleteMultipartUploadResult completeMultipartUploadResult = this.f28965c;
            if (completeMultipartUploadResult != null) {
                completeMultipartUploadResult.getClass();
            }
        }
    }

    public static class CopyObjectResultHandler extends AbstractSSEHandler implements ObjectExpirationResult, S3RequesterChargedResult, S3VersionResult {

        /* renamed from: c, reason: collision with root package name */
        public final CopyObjectResult f28970c = new CopyObjectResult();

        @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
        public final void b(String str) {
            this.f28970c.getClass();
        }

        @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
        public final void c(boolean z13) {
            this.f28970c.getClass();
        }

        @Override // com.amazonaws.services.s3.internal.S3VersionResult
        public final void d() {
            this.f28970c.getClass();
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void e(String str) {
            boolean j13 = j("CopyObjectResult");
            StringBuilder sb3 = this.f28930a;
            if (j13 || j("CopyPartResult")) {
                boolean equals = str.equals("LastModified");
                CopyObjectResult copyObjectResult = this.f28970c;
                if (equals) {
                    String sb4 = sb3.toString();
                    int i13 = ServiceUtils.f28822a;
                    DateUtils.e(sb4);
                    copyObjectResult.getClass();
                    return;
                }
                if (str.equals("ETag")) {
                    ServiceUtils.a(sb3.toString());
                    copyObjectResult.getClass();
                    return;
                }
                return;
            }
            if (j("Error")) {
                if (str.equals("Code")) {
                    sb3.getClass();
                    return;
                }
                if (str.equals("Message")) {
                    sb3.getClass();
                } else if (str.equals("RequestId")) {
                    sb3.getClass();
                } else if (str.equals("HostId")) {
                    sb3.getClass();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void f(String str, Attributes attributes) {
            if (!this.f28931b.isEmpty() || str.equals("CopyObjectResult") || str.equals("CopyPartResult")) {
                return;
            }
            str.equals("Error");
        }

        @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
        public final void g(Date date) {
            this.f28970c.getClass();
        }
    }

    public static class DeleteObjectsHandler extends AbstractHandler {

        /* renamed from: c, reason: collision with root package name */
        public final DeleteObjectsResponse f28971c = new DeleteObjectsResponse();

        /* renamed from: d, reason: collision with root package name */
        public DeleteObjectsResult$DeletedObject f28972d = null;

        /* renamed from: e, reason: collision with root package name */
        public MultiObjectDeleteException.DeleteError f28973e = null;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void e(String str) {
            if (j("DeleteResult")) {
                boolean equals = str.equals("Deleted");
                DeleteObjectsResponse deleteObjectsResponse = this.f28971c;
                if (equals) {
                    deleteObjectsResponse.f28793a.add(this.f28972d);
                    this.f28972d = null;
                    return;
                } else {
                    if (str.equals("Error")) {
                        deleteObjectsResponse.f28794b.add(this.f28973e);
                        this.f28973e = null;
                        return;
                    }
                    return;
                }
            }
            boolean j13 = j("DeleteResult", "Deleted");
            StringBuilder sb3 = this.f28930a;
            if (j13) {
                if (str.equals("Key")) {
                    DeleteObjectsResult$DeletedObject deleteObjectsResult$DeletedObject = this.f28972d;
                    sb3.getClass();
                    deleteObjectsResult$DeletedObject.getClass();
                    return;
                }
                if (str.equals("VersionId")) {
                    DeleteObjectsResult$DeletedObject deleteObjectsResult$DeletedObject2 = this.f28972d;
                    sb3.getClass();
                    deleteObjectsResult$DeletedObject2.getClass();
                    return;
                } else if (str.equals("DeleteMarker")) {
                    DeleteObjectsResult$DeletedObject deleteObjectsResult$DeletedObject3 = this.f28972d;
                    sb3.toString().equals("true");
                    deleteObjectsResult$DeletedObject3.getClass();
                    return;
                } else {
                    if (str.equals("DeleteMarkerVersionId")) {
                        DeleteObjectsResult$DeletedObject deleteObjectsResult$DeletedObject4 = this.f28972d;
                        sb3.getClass();
                        deleteObjectsResult$DeletedObject4.getClass();
                        return;
                    }
                    return;
                }
            }
            if (j("DeleteResult", "Error")) {
                if (str.equals("Key")) {
                    MultiObjectDeleteException.DeleteError deleteError = this.f28973e;
                    sb3.getClass();
                    deleteError.getClass();
                    return;
                }
                if (str.equals("VersionId")) {
                    MultiObjectDeleteException.DeleteError deleteError2 = this.f28973e;
                    sb3.getClass();
                    deleteError2.getClass();
                } else if (str.equals("Code")) {
                    MultiObjectDeleteException.DeleteError deleteError3 = this.f28973e;
                    sb3.getClass();
                    deleteError3.getClass();
                } else if (str.equals("Message")) {
                    MultiObjectDeleteException.DeleteError deleteError4 = this.f28973e;
                    sb3.getClass();
                    deleteError4.getClass();
                }
            }
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [com.amazonaws.services.s3.model.DeleteObjectsResult$DeletedObject] */
        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void f(String str, Attributes attributes) {
            if (j("DeleteResult")) {
                if (str.equals("Deleted")) {
                    this.f28972d = new Serializable() { // from class: com.amazonaws.services.s3.model.DeleteObjectsResult$DeletedObject
                    };
                } else if (str.equals("Error")) {
                    this.f28973e = new MultiObjectDeleteException.DeleteError();
                }
            }
        }
    }

    public static class GetBucketAnalyticsConfigurationHandler extends AbstractHandler {

        /* renamed from: c, reason: collision with root package name */
        public final AnalyticsConfiguration f28974c = new AnalyticsConfiguration();

        /* renamed from: d, reason: collision with root package name */
        public AnalyticsFilter f28975d;

        /* renamed from: e, reason: collision with root package name */
        public ArrayList f28976e;

        /* renamed from: f, reason: collision with root package name */
        public StorageClassAnalysis f28977f;

        /* renamed from: g, reason: collision with root package name */
        public StorageClassAnalysisDataExport f28978g;

        /* renamed from: h, reason: collision with root package name */
        public AnalyticsExportDestination f28979h;

        /* renamed from: i, reason: collision with root package name */
        public AnalyticsS3BucketDestination f28980i;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void e(String str) {
            boolean j13 = j("AnalyticsConfiguration");
            StringBuilder sb3 = this.f28930a;
            if (j13) {
                boolean equals = str.equals("Id");
                AnalyticsConfiguration analyticsConfiguration = this.f28974c;
                if (equals) {
                    sb3.getClass();
                    analyticsConfiguration.getClass();
                    return;
                } else if (str.equals("Filter")) {
                    analyticsConfiguration.getClass();
                    return;
                } else {
                    if (str.equals("StorageClassAnalysis")) {
                        analyticsConfiguration.getClass();
                        return;
                    }
                    return;
                }
            }
            if (j("AnalyticsConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    AnalyticsFilter analyticsFilter = this.f28975d;
                    sb3.getClass();
                    new AnalyticsPrefixPredicate();
                    analyticsFilter.getClass();
                    return;
                }
                if (str.equals("Tag")) {
                    AnalyticsFilter analyticsFilter2 = this.f28975d;
                    new AnalyticsTagPredicate();
                    analyticsFilter2.getClass();
                    return;
                } else {
                    if (str.equals("And")) {
                        AnalyticsFilter analyticsFilter3 = this.f28975d;
                        new AnalyticsAndOperator(this.f28976e);
                        analyticsFilter3.getClass();
                        this.f28976e = null;
                        return;
                    }
                    return;
                }
            }
            if (j("AnalyticsConfiguration", "Filter", "Tag")) {
                if (str.equals("Key")) {
                    sb3.getClass();
                    return;
                } else {
                    if (str.equals("Value")) {
                        sb3.getClass();
                        return;
                    }
                    return;
                }
            }
            if (j("AnalyticsConfiguration", "Filter", "And")) {
                if (str.equals("Prefix")) {
                    ArrayList arrayList = this.f28976e;
                    sb3.getClass();
                    arrayList.add(new AnalyticsPrefixPredicate());
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f28976e.add(new AnalyticsTagPredicate());
                        return;
                    }
                    return;
                }
            }
            if (j("AnalyticsConfiguration", "Filter", "And", "Tag")) {
                if (str.equals("Key")) {
                    sb3.getClass();
                    return;
                } else {
                    if (str.equals("Value")) {
                        sb3.getClass();
                        return;
                    }
                    return;
                }
            }
            if (j("AnalyticsConfiguration", "StorageClassAnalysis")) {
                if (str.equals("DataExport")) {
                    this.f28977f.getClass();
                    return;
                }
                return;
            }
            if (j("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                if (str.equals("OutputSchemaVersion")) {
                    StorageClassAnalysisDataExport storageClassAnalysisDataExport = this.f28978g;
                    sb3.getClass();
                    storageClassAnalysisDataExport.getClass();
                    return;
                } else {
                    if (str.equals("Destination")) {
                        this.f28978g.getClass();
                        return;
                    }
                    return;
                }
            }
            if (j("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination")) {
                if (str.equals("S3BucketDestination")) {
                    this.f28979h.getClass();
                    return;
                }
                return;
            }
            if (j("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination", "S3BucketDestination")) {
                if (str.equals("Format")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination = this.f28980i;
                    sb3.getClass();
                    analyticsS3BucketDestination.getClass();
                    return;
                }
                if (str.equals("BucketAccountId")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination2 = this.f28980i;
                    sb3.getClass();
                    analyticsS3BucketDestination2.getClass();
                } else if (str.equals("Bucket")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination3 = this.f28980i;
                    sb3.getClass();
                    analyticsS3BucketDestination3.getClass();
                } else if (str.equals("Prefix")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination4 = this.f28980i;
                    sb3.getClass();
                    analyticsS3BucketDestination4.getClass();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void f(String str, Attributes attributes) {
            if (j("AnalyticsConfiguration")) {
                if (str.equals("Filter")) {
                    this.f28975d = new AnalyticsFilter();
                    return;
                } else {
                    if (str.equals("StorageClassAnalysis")) {
                        this.f28977f = new StorageClassAnalysis();
                        return;
                    }
                    return;
                }
            }
            if (j("AnalyticsConfiguration", "Filter")) {
                if (str.equals("And")) {
                    this.f28976e = new ArrayList();
                }
            } else if (j("AnalyticsConfiguration", "StorageClassAnalysis")) {
                if (str.equals("DataExport")) {
                    this.f28978g = new StorageClassAnalysisDataExport();
                }
            } else if (j("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                if (str.equals("Destination")) {
                    this.f28979h = new AnalyticsExportDestination();
                }
            } else if (j("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination") && str.equals("S3BucketDestination")) {
                this.f28980i = new AnalyticsS3BucketDestination();
            }
        }
    }

    public static class GetBucketInventoryConfigurationHandler extends AbstractHandler {

        /* renamed from: c, reason: collision with root package name */
        public final InventoryConfiguration f28981c;

        /* renamed from: d, reason: collision with root package name */
        public ArrayList f28982d;

        /* renamed from: e, reason: collision with root package name */
        public InventoryDestination f28983e;

        /* renamed from: f, reason: collision with root package name */
        public InventoryFilter f28984f;

        /* renamed from: g, reason: collision with root package name */
        public InventoryS3BucketDestination f28985g;

        /* renamed from: h, reason: collision with root package name */
        public InventorySchedule f28986h;

        public GetBucketInventoryConfigurationHandler() {
            new GetBucketInventoryConfigurationResult();
            this.f28981c = new InventoryConfiguration();
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void e(String str) {
            boolean j13 = j("InventoryConfiguration");
            StringBuilder sb3 = this.f28930a;
            if (j13) {
                boolean equals = str.equals("Id");
                InventoryConfiguration inventoryConfiguration = this.f28981c;
                if (equals) {
                    sb3.getClass();
                    inventoryConfiguration.getClass();
                    return;
                }
                if (str.equals("Destination")) {
                    inventoryConfiguration.getClass();
                    this.f28983e = null;
                    return;
                }
                if (str.equals("IsEnabled")) {
                    "true".equals(sb3.toString());
                    inventoryConfiguration.getClass();
                    return;
                }
                if (str.equals("Filter")) {
                    inventoryConfiguration.getClass();
                    this.f28984f = null;
                    return;
                }
                if (str.equals("IncludedObjectVersions")) {
                    sb3.getClass();
                    inventoryConfiguration.getClass();
                    return;
                } else if (str.equals("Schedule")) {
                    inventoryConfiguration.getClass();
                    this.f28986h = null;
                    return;
                } else {
                    if (str.equals("OptionalFields")) {
                        inventoryConfiguration.f28927a = this.f28982d;
                        this.f28982d = null;
                        return;
                    }
                    return;
                }
            }
            if (j("InventoryConfiguration", "Destination")) {
                if (str.equals("S3BucketDestination")) {
                    this.f28983e.getClass();
                    this.f28985g = null;
                    return;
                }
                return;
            }
            if (!j("InventoryConfiguration", "Destination", "S3BucketDestination")) {
                if (j("InventoryConfiguration", "Filter")) {
                    if (str.equals("Prefix")) {
                        InventoryFilter inventoryFilter = this.f28984f;
                        sb3.getClass();
                        new InventoryPrefixPredicate();
                        inventoryFilter.getClass();
                        return;
                    }
                    return;
                }
                if (!j("InventoryConfiguration", "Schedule")) {
                    if (j("InventoryConfiguration", "OptionalFields") && str.equals("Field")) {
                        this.f28982d.add(sb3.toString());
                        return;
                    }
                    return;
                }
                if (str.equals("Frequency")) {
                    InventorySchedule inventorySchedule = this.f28986h;
                    sb3.getClass();
                    inventorySchedule.getClass();
                    return;
                }
                return;
            }
            if (str.equals("AccountId")) {
                InventoryS3BucketDestination inventoryS3BucketDestination = this.f28985g;
                sb3.getClass();
                inventoryS3BucketDestination.getClass();
                return;
            }
            if (str.equals("Bucket")) {
                InventoryS3BucketDestination inventoryS3BucketDestination2 = this.f28985g;
                sb3.getClass();
                inventoryS3BucketDestination2.getClass();
            } else if (str.equals("Format")) {
                InventoryS3BucketDestination inventoryS3BucketDestination3 = this.f28985g;
                sb3.getClass();
                inventoryS3BucketDestination3.getClass();
            } else if (str.equals("Prefix")) {
                InventoryS3BucketDestination inventoryS3BucketDestination4 = this.f28985g;
                sb3.getClass();
                inventoryS3BucketDestination4.getClass();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void f(String str, Attributes attributes) {
            if (!j("InventoryConfiguration")) {
                if (j("InventoryConfiguration", "Destination") && str.equals("S3BucketDestination")) {
                    this.f28985g = new InventoryS3BucketDestination();
                    return;
                }
                return;
            }
            if (str.equals("Destination")) {
                this.f28983e = new InventoryDestination();
                return;
            }
            if (str.equals("Filter")) {
                this.f28984f = new InventoryFilter();
            } else if (str.equals("Schedule")) {
                this.f28986h = new InventorySchedule();
            } else if (str.equals("OptionalFields")) {
                this.f28982d = new ArrayList();
            }
        }
    }

    public static class GetBucketMetricsConfigurationHandler extends AbstractHandler {

        /* renamed from: c, reason: collision with root package name */
        public final MetricsConfiguration f28987c = new MetricsConfiguration();

        /* renamed from: d, reason: collision with root package name */
        public MetricsFilter f28988d;

        /* renamed from: e, reason: collision with root package name */
        public ArrayList f28989e;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void e(String str) {
            boolean j13 = j("MetricsConfiguration");
            StringBuilder sb3 = this.f28930a;
            if (j13) {
                boolean equals = str.equals("Id");
                MetricsConfiguration metricsConfiguration = this.f28987c;
                if (equals) {
                    sb3.getClass();
                    metricsConfiguration.getClass();
                    return;
                } else {
                    if (str.equals("Filter")) {
                        metricsConfiguration.getClass();
                        this.f28988d = null;
                        return;
                    }
                    return;
                }
            }
            if (j("MetricsConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    MetricsFilter metricsFilter = this.f28988d;
                    sb3.getClass();
                    new MetricsPrefixPredicate();
                    metricsFilter.getClass();
                    return;
                }
                if (str.equals("Tag")) {
                    MetricsFilter metricsFilter2 = this.f28988d;
                    new MetricsTagPredicate();
                    metricsFilter2.getClass();
                    return;
                } else {
                    if (str.equals("And")) {
                        MetricsFilter metricsFilter3 = this.f28988d;
                        new MetricsAndOperator(this.f28989e);
                        metricsFilter3.getClass();
                        this.f28989e = null;
                        return;
                    }
                    return;
                }
            }
            if (j("MetricsConfiguration", "Filter", "Tag")) {
                if (str.equals("Key")) {
                    sb3.getClass();
                    return;
                } else {
                    if (str.equals("Value")) {
                        sb3.getClass();
                        return;
                    }
                    return;
                }
            }
            if (j("MetricsConfiguration", "Filter", "And")) {
                if (str.equals("Prefix")) {
                    ArrayList arrayList = this.f28989e;
                    sb3.getClass();
                    arrayList.add(new MetricsPrefixPredicate());
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f28989e.add(new MetricsTagPredicate());
                        return;
                    }
                    return;
                }
            }
            if (j("MetricsConfiguration", "Filter", "And", "Tag")) {
                if (str.equals("Key")) {
                    sb3.getClass();
                } else if (str.equals("Value")) {
                    sb3.getClass();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void f(String str, Attributes attributes) {
            if (j("MetricsConfiguration")) {
                if (str.equals("Filter")) {
                    this.f28988d = new MetricsFilter();
                }
            } else if (j("MetricsConfiguration", "Filter") && str.equals("And")) {
                this.f28989e = new ArrayList();
            }
        }
    }

    public static class GetObjectTaggingHandler extends AbstractHandler {

        /* renamed from: c, reason: collision with root package name */
        public ArrayList f28990c;

        /* renamed from: d, reason: collision with root package name */
        public String f28991d;

        /* renamed from: e, reason: collision with root package name */
        public String f28992e;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void e(String str) {
            if (j("Tagging") && str.equals("TagSet")) {
                this.f28990c = null;
            }
            if (j("Tagging", "TagSet")) {
                if (str.equals("Tag")) {
                    this.f28990c.add(new Tag(this.f28992e, this.f28991d));
                    this.f28992e = null;
                    this.f28991d = null;
                    return;
                }
                return;
            }
            if (j("Tagging", "TagSet", "Tag")) {
                boolean equals = str.equals("Key");
                StringBuilder sb3 = this.f28930a;
                if (equals) {
                    this.f28992e = sb3.toString();
                } else if (str.equals("Value")) {
                    this.f28991d = sb3.toString();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void f(String str, Attributes attributes) {
            if (j("Tagging") && str.equals("TagSet")) {
                this.f28990c = new ArrayList();
            }
        }
    }

    public static class InitiateMultipartUploadHandler extends AbstractHandler {

        /* renamed from: c, reason: collision with root package name */
        public final InitiateMultipartUploadResult f28993c = new InitiateMultipartUploadResult();

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void e(String str) {
            if (j("InitiateMultipartUploadResult")) {
                boolean equals = str.equals("Bucket");
                StringBuilder sb3 = this.f28930a;
                InitiateMultipartUploadResult initiateMultipartUploadResult = this.f28993c;
                if (equals) {
                    sb3.getClass();
                    initiateMultipartUploadResult.getClass();
                } else if (str.equals("Key")) {
                    sb3.getClass();
                    initiateMultipartUploadResult.getClass();
                } else if (str.equals("UploadId")) {
                    initiateMultipartUploadResult.f28880a = sb3.toString();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void f(String str, Attributes attributes) {
        }
    }

    public static class ListAllMyBucketsHandler extends AbstractHandler {

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f28994c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public Owner f28995d = null;

        /* renamed from: e, reason: collision with root package name */
        public Bucket f28996e = null;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void e(String str) {
            boolean j13 = j("ListAllMyBucketsResult", "Owner");
            StringBuilder sb3 = this.f28930a;
            if (j13) {
                if (str.equals("ID")) {
                    this.f28995d.f28895b = sb3.toString();
                    return;
                } else {
                    if (str.equals("DisplayName")) {
                        this.f28995d.f28894a = sb3.toString();
                        return;
                    }
                    return;
                }
            }
            if (j("ListAllMyBucketsResult", "Buckets")) {
                if (str.equals("Bucket")) {
                    this.f28994c.add(this.f28996e);
                    this.f28996e = null;
                    return;
                }
                return;
            }
            if (j("ListAllMyBucketsResult", "Buckets", "Bucket")) {
                if (str.equals("Name")) {
                    this.f28996e.f28848a = sb3.toString();
                } else if (str.equals("CreationDate")) {
                    this.f28996e.f28850c = DateUtils.e(sb3.toString());
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void f(String str, Attributes attributes) {
            if (j("ListAllMyBucketsResult")) {
                if (str.equals("Owner")) {
                    this.f28995d = new Owner();
                }
            } else if (j("ListAllMyBucketsResult", "Buckets") && str.equals("Bucket")) {
                Bucket bucket = new Bucket();
                this.f28996e = bucket;
                bucket.f28849b = this.f28995d;
            }
        }
    }

    public static class ListBucketAnalyticsConfigurationHandler extends AbstractHandler {

        /* renamed from: c, reason: collision with root package name */
        public final ListBucketAnalyticsConfigurationsResult f28997c = new ListBucketAnalyticsConfigurationsResult();

        /* renamed from: d, reason: collision with root package name */
        public AnalyticsConfiguration f28998d;

        /* renamed from: e, reason: collision with root package name */
        public AnalyticsFilter f28999e;

        /* renamed from: f, reason: collision with root package name */
        public ArrayList f29000f;

        /* renamed from: g, reason: collision with root package name */
        public StorageClassAnalysis f29001g;

        /* renamed from: h, reason: collision with root package name */
        public StorageClassAnalysisDataExport f29002h;

        /* renamed from: i, reason: collision with root package name */
        public AnalyticsExportDestination f29003i;

        /* renamed from: j, reason: collision with root package name */
        public AnalyticsS3BucketDestination f29004j;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void e(String str) {
            boolean j13 = j("ListBucketAnalyticsConfigurationsResult");
            StringBuilder sb3 = this.f28930a;
            if (j13) {
                boolean equals = str.equals("AnalyticsConfiguration");
                ListBucketAnalyticsConfigurationsResult listBucketAnalyticsConfigurationsResult = this.f28997c;
                if (equals) {
                    if (listBucketAnalyticsConfigurationsResult.f28881a == null) {
                        listBucketAnalyticsConfigurationsResult.f28881a = new ArrayList();
                    }
                    listBucketAnalyticsConfigurationsResult.f28881a.add(this.f28998d);
                    this.f28998d = null;
                    return;
                }
                if (str.equals("IsTruncated")) {
                    "true".equals(sb3.toString());
                    listBucketAnalyticsConfigurationsResult.getClass();
                    return;
                } else if (str.equals("ContinuationToken")) {
                    sb3.getClass();
                    listBucketAnalyticsConfigurationsResult.getClass();
                    return;
                } else {
                    if (str.equals("NextContinuationToken")) {
                        sb3.getClass();
                        listBucketAnalyticsConfigurationsResult.getClass();
                        return;
                    }
                    return;
                }
            }
            if (j("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration")) {
                if (str.equals("Id")) {
                    AnalyticsConfiguration analyticsConfiguration = this.f28998d;
                    sb3.getClass();
                    analyticsConfiguration.getClass();
                    return;
                } else if (str.equals("Filter")) {
                    this.f28998d.getClass();
                    return;
                } else {
                    if (str.equals("StorageClassAnalysis")) {
                        this.f28998d.getClass();
                        return;
                    }
                    return;
                }
            }
            if (j("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    AnalyticsFilter analyticsFilter = this.f28999e;
                    sb3.getClass();
                    new AnalyticsPrefixPredicate();
                    analyticsFilter.getClass();
                    return;
                }
                if (str.equals("Tag")) {
                    AnalyticsFilter analyticsFilter2 = this.f28999e;
                    new AnalyticsTagPredicate();
                    analyticsFilter2.getClass();
                    return;
                } else {
                    if (str.equals("And")) {
                        AnalyticsFilter analyticsFilter3 = this.f28999e;
                        new AnalyticsAndOperator(this.f29000f);
                        analyticsFilter3.getClass();
                        this.f29000f = null;
                        return;
                    }
                    return;
                }
            }
            if (j("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter", "Tag")) {
                if (str.equals("Key")) {
                    sb3.getClass();
                    return;
                } else {
                    if (str.equals("Value")) {
                        sb3.getClass();
                        return;
                    }
                    return;
                }
            }
            if (j("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter", "And")) {
                if (str.equals("Prefix")) {
                    ArrayList arrayList = this.f29000f;
                    sb3.getClass();
                    arrayList.add(new AnalyticsPrefixPredicate());
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f29000f.add(new AnalyticsTagPredicate());
                        return;
                    }
                    return;
                }
            }
            if (j("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter", "And", "Tag")) {
                if (str.equals("Key")) {
                    sb3.getClass();
                    return;
                } else {
                    if (str.equals("Value")) {
                        sb3.getClass();
                        return;
                    }
                    return;
                }
            }
            if (j("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis")) {
                if (str.equals("DataExport")) {
                    this.f29001g.getClass();
                    return;
                }
                return;
            }
            if (j("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                if (str.equals("OutputSchemaVersion")) {
                    StorageClassAnalysisDataExport storageClassAnalysisDataExport = this.f29002h;
                    sb3.getClass();
                    storageClassAnalysisDataExport.getClass();
                    return;
                } else {
                    if (str.equals("Destination")) {
                        this.f29002h.getClass();
                        return;
                    }
                    return;
                }
            }
            if (j("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination")) {
                if (str.equals("S3BucketDestination")) {
                    this.f29003i.getClass();
                    return;
                }
                return;
            }
            if (j("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination", "S3BucketDestination")) {
                if (str.equals("Format")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination = this.f29004j;
                    sb3.getClass();
                    analyticsS3BucketDestination.getClass();
                    return;
                }
                if (str.equals("BucketAccountId")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination2 = this.f29004j;
                    sb3.getClass();
                    analyticsS3BucketDestination2.getClass();
                } else if (str.equals("Bucket")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination3 = this.f29004j;
                    sb3.getClass();
                    analyticsS3BucketDestination3.getClass();
                } else if (str.equals("Prefix")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination4 = this.f29004j;
                    sb3.getClass();
                    analyticsS3BucketDestination4.getClass();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void f(String str, Attributes attributes) {
            if (j("ListBucketAnalyticsConfigurationsResult")) {
                if (str.equals("AnalyticsConfiguration")) {
                    this.f28998d = new AnalyticsConfiguration();
                    return;
                }
                return;
            }
            if (j("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration")) {
                if (str.equals("Filter")) {
                    this.f28999e = new AnalyticsFilter();
                    return;
                } else {
                    if (str.equals("StorageClassAnalysis")) {
                        this.f29001g = new StorageClassAnalysis();
                        return;
                    }
                    return;
                }
            }
            if (j("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter")) {
                if (str.equals("And")) {
                    this.f29000f = new ArrayList();
                }
            } else if (j("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis")) {
                if (str.equals("DataExport")) {
                    this.f29002h = new StorageClassAnalysisDataExport();
                }
            } else if (j("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                if (str.equals("Destination")) {
                    this.f29003i = new AnalyticsExportDestination();
                }
            } else if (j("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination") && str.equals("S3BucketDestination")) {
                this.f29004j = new AnalyticsS3BucketDestination();
            }
        }
    }

    public static class ListBucketHandler extends AbstractHandler {

        /* renamed from: c, reason: collision with root package name */
        public S3ObjectSummary f29005c;

        /* renamed from: d, reason: collision with root package name */
        public Owner f29006d;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void e(String str) {
            if (this.f28931b.isEmpty()) {
                if (str.equals("ListBucketResult")) {
                    throw null;
                }
                return;
            }
            boolean j13 = j("ListBucketResult");
            StringBuilder sb3 = this.f28930a;
            if (j13) {
                if (str.equals("Name")) {
                    sb3.getClass();
                    throw null;
                }
                if (str.equals("Prefix")) {
                    sb3.toString();
                    Log log = XmlResponsesSaxParser.f28932b;
                    throw null;
                }
                if (str.equals("Marker")) {
                    sb3.toString();
                    Log log2 = XmlResponsesSaxParser.f28932b;
                    throw null;
                }
                if (str.equals("NextMarker")) {
                    sb3.getClass();
                    Log log3 = XmlResponsesSaxParser.f28932b;
                    throw null;
                }
                if (str.equals("MaxKeys")) {
                    XmlResponsesSaxParser.b(sb3.toString());
                    throw null;
                }
                if (str.equals("Delimiter")) {
                    sb3.toString();
                    Log log4 = XmlResponsesSaxParser.f28932b;
                    throw null;
                }
                if (str.equals("EncodingType")) {
                    sb3.toString();
                    Log log5 = XmlResponsesSaxParser.f28932b;
                    throw null;
                }
                if (!str.equals("IsTruncated")) {
                    if (str.equals("Contents")) {
                        throw null;
                    }
                    return;
                }
                String a13 = StringUtils.a(sb3.toString());
                if (a13.startsWith("false")) {
                    throw null;
                }
                if (!a13.startsWith("true")) {
                    throw new IllegalStateException("Invalid value for IsTruncated field: ".concat(a13));
                }
                throw null;
            }
            if (!j("ListBucketResult", "Contents")) {
                if (!j("ListBucketResult", "Contents", "Owner")) {
                    if (j("ListBucketResult", "CommonPrefixes") && str.equals("Prefix")) {
                        throw null;
                    }
                    return;
                } else if (str.equals("ID")) {
                    this.f29006d.f28895b = sb3.toString();
                    return;
                } else {
                    if (str.equals("DisplayName")) {
                        this.f29006d.f28894a = sb3.toString();
                        return;
                    }
                    return;
                }
            }
            if (str.equals("Key")) {
                String sb4 = sb3.toString();
                S3ObjectSummary s3ObjectSummary = this.f29005c;
                Log log6 = XmlResponsesSaxParser.f28932b;
                s3ObjectSummary.f28907a = sb4;
                return;
            }
            if (str.equals("LastModified")) {
                S3ObjectSummary s3ObjectSummary2 = this.f29005c;
                String sb5 = sb3.toString();
                int i13 = ServiceUtils.f28822a;
                s3ObjectSummary2.f28910d = DateUtils.e(sb5);
                return;
            }
            if (str.equals("ETag")) {
                this.f29005c.f28908b = ServiceUtils.a(sb3.toString());
                return;
            }
            if (str.equals("Size")) {
                this.f29005c.f28909c = XmlResponsesSaxParser.c(sb3.toString());
            } else if (str.equals("StorageClass")) {
                this.f29005c.f28911e = sb3.toString();
            } else if (str.equals("Owner")) {
                this.f29005c.f28912f = this.f29006d;
                this.f29006d = null;
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void f(String str, Attributes attributes) {
            if (j("ListBucketResult")) {
                if (str.equals("Contents")) {
                    this.f29005c = new S3ObjectSummary();
                    throw null;
                }
            } else if (j("ListBucketResult", "Contents") && str.equals("Owner")) {
                this.f29006d = new Owner();
            }
        }
    }

    public static class ListBucketInventoryConfigurationsHandler extends AbstractHandler {

        /* renamed from: c, reason: collision with root package name */
        public final ListBucketInventoryConfigurationsResult f29007c = new ListBucketInventoryConfigurationsResult();

        /* renamed from: d, reason: collision with root package name */
        public InventoryConfiguration f29008d;

        /* renamed from: e, reason: collision with root package name */
        public ArrayList f29009e;

        /* renamed from: f, reason: collision with root package name */
        public InventoryDestination f29010f;

        /* renamed from: g, reason: collision with root package name */
        public InventoryFilter f29011g;

        /* renamed from: h, reason: collision with root package name */
        public InventoryS3BucketDestination f29012h;

        /* renamed from: i, reason: collision with root package name */
        public InventorySchedule f29013i;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void e(String str) {
            boolean j13 = j("ListInventoryConfigurationsResult");
            StringBuilder sb3 = this.f28930a;
            if (j13) {
                boolean equals = str.equals("InventoryConfiguration");
                ListBucketInventoryConfigurationsResult listBucketInventoryConfigurationsResult = this.f29007c;
                if (equals) {
                    if (listBucketInventoryConfigurationsResult.f28882a == null) {
                        listBucketInventoryConfigurationsResult.f28882a = new ArrayList();
                    }
                    listBucketInventoryConfigurationsResult.f28882a.add(this.f29008d);
                    this.f29008d = null;
                    return;
                }
                if (str.equals("IsTruncated")) {
                    "true".equals(sb3.toString());
                    listBucketInventoryConfigurationsResult.getClass();
                    return;
                } else if (str.equals("ContinuationToken")) {
                    sb3.getClass();
                    listBucketInventoryConfigurationsResult.getClass();
                    return;
                } else {
                    if (str.equals("NextContinuationToken")) {
                        sb3.getClass();
                        listBucketInventoryConfigurationsResult.getClass();
                        return;
                    }
                    return;
                }
            }
            if (j("ListInventoryConfigurationsResult", "InventoryConfiguration")) {
                if (str.equals("Id")) {
                    InventoryConfiguration inventoryConfiguration = this.f29008d;
                    sb3.getClass();
                    inventoryConfiguration.getClass();
                    return;
                }
                if (str.equals("Destination")) {
                    this.f29008d.getClass();
                    this.f29010f = null;
                    return;
                }
                if (str.equals("IsEnabled")) {
                    InventoryConfiguration inventoryConfiguration2 = this.f29008d;
                    "true".equals(sb3.toString());
                    inventoryConfiguration2.getClass();
                    return;
                }
                if (str.equals("Filter")) {
                    this.f29008d.getClass();
                    this.f29011g = null;
                    return;
                }
                if (str.equals("IncludedObjectVersions")) {
                    InventoryConfiguration inventoryConfiguration3 = this.f29008d;
                    sb3.getClass();
                    inventoryConfiguration3.getClass();
                    return;
                } else if (str.equals("Schedule")) {
                    this.f29008d.getClass();
                    this.f29013i = null;
                    return;
                } else {
                    if (str.equals("OptionalFields")) {
                        this.f29008d.f28927a = this.f29009e;
                        this.f29009e = null;
                        return;
                    }
                    return;
                }
            }
            if (j("ListInventoryConfigurationsResult", "InventoryConfiguration", "Destination")) {
                if (str.equals("S3BucketDestination")) {
                    this.f29010f.getClass();
                    this.f29012h = null;
                    return;
                }
                return;
            }
            if (!j("ListInventoryConfigurationsResult", "InventoryConfiguration", "Destination", "S3BucketDestination")) {
                if (j("ListInventoryConfigurationsResult", "InventoryConfiguration", "Filter")) {
                    if (str.equals("Prefix")) {
                        InventoryFilter inventoryFilter = this.f29011g;
                        sb3.getClass();
                        new InventoryPrefixPredicate();
                        inventoryFilter.getClass();
                        return;
                    }
                    return;
                }
                if (!j("ListInventoryConfigurationsResult", "InventoryConfiguration", "Schedule")) {
                    if (j("ListInventoryConfigurationsResult", "InventoryConfiguration", "OptionalFields") && str.equals("Field")) {
                        this.f29009e.add(sb3.toString());
                        return;
                    }
                    return;
                }
                if (str.equals("Frequency")) {
                    InventorySchedule inventorySchedule = this.f29013i;
                    sb3.getClass();
                    inventorySchedule.getClass();
                    return;
                }
                return;
            }
            if (str.equals("AccountId")) {
                InventoryS3BucketDestination inventoryS3BucketDestination = this.f29012h;
                sb3.getClass();
                inventoryS3BucketDestination.getClass();
                return;
            }
            if (str.equals("Bucket")) {
                InventoryS3BucketDestination inventoryS3BucketDestination2 = this.f29012h;
                sb3.getClass();
                inventoryS3BucketDestination2.getClass();
            } else if (str.equals("Format")) {
                InventoryS3BucketDestination inventoryS3BucketDestination3 = this.f29012h;
                sb3.getClass();
                inventoryS3BucketDestination3.getClass();
            } else if (str.equals("Prefix")) {
                InventoryS3BucketDestination inventoryS3BucketDestination4 = this.f29012h;
                sb3.getClass();
                inventoryS3BucketDestination4.getClass();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void f(String str, Attributes attributes) {
            if (j("ListInventoryConfigurationsResult")) {
                if (str.equals("InventoryConfiguration")) {
                    this.f29008d = new InventoryConfiguration();
                    return;
                }
                return;
            }
            if (!j("ListInventoryConfigurationsResult", "InventoryConfiguration")) {
                if (j("ListInventoryConfigurationsResult", "InventoryConfiguration", "Destination") && str.equals("S3BucketDestination")) {
                    this.f29012h = new InventoryS3BucketDestination();
                    return;
                }
                return;
            }
            if (str.equals("Destination")) {
                this.f29010f = new InventoryDestination();
                return;
            }
            if (str.equals("Filter")) {
                this.f29011g = new InventoryFilter();
            } else if (str.equals("Schedule")) {
                this.f29013i = new InventorySchedule();
            } else if (str.equals("OptionalFields")) {
                this.f29009e = new ArrayList();
            }
        }
    }

    public static class ListBucketMetricsConfigurationsHandler extends AbstractHandler {

        /* renamed from: c, reason: collision with root package name */
        public final ListBucketMetricsConfigurationsResult f29014c = new ListBucketMetricsConfigurationsResult();

        /* renamed from: d, reason: collision with root package name */
        public MetricsConfiguration f29015d;

        /* renamed from: e, reason: collision with root package name */
        public MetricsFilter f29016e;

        /* renamed from: f, reason: collision with root package name */
        public ArrayList f29017f;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void e(String str) {
            boolean j13 = j("ListMetricsConfigurationsResult");
            StringBuilder sb3 = this.f28930a;
            if (j13) {
                boolean equals = str.equals("MetricsConfiguration");
                ListBucketMetricsConfigurationsResult listBucketMetricsConfigurationsResult = this.f29014c;
                if (equals) {
                    if (listBucketMetricsConfigurationsResult.f28883a == null) {
                        listBucketMetricsConfigurationsResult.f28883a = new ArrayList();
                    }
                    listBucketMetricsConfigurationsResult.f28883a.add(this.f29015d);
                    this.f29015d = null;
                    return;
                }
                if (str.equals("IsTruncated")) {
                    "true".equals(sb3.toString());
                    listBucketMetricsConfigurationsResult.getClass();
                    return;
                } else if (str.equals("ContinuationToken")) {
                    sb3.getClass();
                    listBucketMetricsConfigurationsResult.getClass();
                    return;
                } else {
                    if (str.equals("NextContinuationToken")) {
                        sb3.getClass();
                        listBucketMetricsConfigurationsResult.getClass();
                        return;
                    }
                    return;
                }
            }
            if (j("ListMetricsConfigurationsResult", "MetricsConfiguration")) {
                if (str.equals("Id")) {
                    MetricsConfiguration metricsConfiguration = this.f29015d;
                    sb3.getClass();
                    metricsConfiguration.getClass();
                    return;
                } else {
                    if (str.equals("Filter")) {
                        this.f29015d.getClass();
                        this.f29016e = null;
                        return;
                    }
                    return;
                }
            }
            if (j("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    MetricsFilter metricsFilter = this.f29016e;
                    sb3.getClass();
                    new MetricsPrefixPredicate();
                    metricsFilter.getClass();
                    return;
                }
                if (str.equals("Tag")) {
                    MetricsFilter metricsFilter2 = this.f29016e;
                    new MetricsTagPredicate();
                    metricsFilter2.getClass();
                    return;
                } else {
                    if (str.equals("And")) {
                        MetricsFilter metricsFilter3 = this.f29016e;
                        new MetricsAndOperator(this.f29017f);
                        metricsFilter3.getClass();
                        this.f29017f = null;
                        return;
                    }
                    return;
                }
            }
            if (j("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter", "Tag")) {
                if (str.equals("Key")) {
                    sb3.getClass();
                    return;
                } else {
                    if (str.equals("Value")) {
                        sb3.getClass();
                        return;
                    }
                    return;
                }
            }
            if (j("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter", "And")) {
                if (str.equals("Prefix")) {
                    ArrayList arrayList = this.f29017f;
                    sb3.getClass();
                    arrayList.add(new MetricsPrefixPredicate());
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f29017f.add(new MetricsTagPredicate());
                        return;
                    }
                    return;
                }
            }
            if (j("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter", "And", "Tag")) {
                if (str.equals("Key")) {
                    sb3.getClass();
                } else if (str.equals("Value")) {
                    sb3.getClass();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void f(String str, Attributes attributes) {
            if (j("ListMetricsConfigurationsResult")) {
                if (str.equals("MetricsConfiguration")) {
                    this.f29015d = new MetricsConfiguration();
                }
            } else if (j("ListMetricsConfigurationsResult", "MetricsConfiguration")) {
                if (str.equals("Filter")) {
                    this.f29016e = new MetricsFilter();
                }
            } else if (j("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter") && str.equals("And")) {
                this.f29017f = new ArrayList();
            }
        }
    }

    public static class ListMultipartUploadsHandler extends AbstractHandler {

        /* renamed from: c, reason: collision with root package name */
        public final MultipartUploadListing f29018c = new MultipartUploadListing();

        /* renamed from: d, reason: collision with root package name */
        public MultipartUpload f29019d;

        /* renamed from: e, reason: collision with root package name */
        public Owner f29020e;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void e(String str) {
            boolean j13 = j("ListMultipartUploadsResult");
            MultipartUploadListing multipartUploadListing = this.f29018c;
            StringBuilder sb3 = this.f28930a;
            if (!j13) {
                if (j("ListMultipartUploadsResult", "CommonPrefixes")) {
                    if (str.equals("Prefix")) {
                        multipartUploadListing.f28885b.add(sb3.toString());
                        return;
                    }
                    return;
                }
                if (!j("ListMultipartUploadsResult", "Upload")) {
                    if (j("ListMultipartUploadsResult", "Upload", "Owner") || j("ListMultipartUploadsResult", "Upload", "Initiator")) {
                        if (str.equals("ID")) {
                            this.f29020e.f28895b = XmlResponsesSaxParser.a(sb3.toString());
                            return;
                        } else {
                            if (str.equals("DisplayName")) {
                                this.f29020e.f28894a = XmlResponsesSaxParser.a(sb3.toString());
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                if (str.equals("Key")) {
                    MultipartUpload multipartUpload = this.f29019d;
                    sb3.getClass();
                    multipartUpload.getClass();
                    return;
                }
                if (str.equals("UploadId")) {
                    MultipartUpload multipartUpload2 = this.f29019d;
                    sb3.getClass();
                    multipartUpload2.getClass();
                    return;
                }
                if (str.equals("Owner")) {
                    this.f29019d.getClass();
                    this.f29020e = null;
                    return;
                }
                if (str.equals("Initiator")) {
                    this.f29019d.getClass();
                    this.f29020e = null;
                    return;
                }
                if (str.equals("StorageClass")) {
                    MultipartUpload multipartUpload3 = this.f29019d;
                    sb3.getClass();
                    multipartUpload3.getClass();
                    return;
                } else {
                    if (str.equals("Initiated")) {
                        MultipartUpload multipartUpload4 = this.f29019d;
                        String sb4 = sb3.toString();
                        int i13 = ServiceUtils.f28822a;
                        DateUtils.e(sb4);
                        multipartUpload4.getClass();
                        return;
                    }
                    return;
                }
            }
            if (str.equals("Bucket")) {
                sb3.getClass();
                multipartUploadListing.getClass();
                return;
            }
            if (str.equals("KeyMarker")) {
                sb3.toString();
                Log log = XmlResponsesSaxParser.f28932b;
                multipartUploadListing.getClass();
                return;
            }
            if (str.equals("Delimiter")) {
                sb3.toString();
                Log log2 = XmlResponsesSaxParser.f28932b;
                multipartUploadListing.getClass();
                return;
            }
            if (str.equals("Prefix")) {
                sb3.toString();
                Log log3 = XmlResponsesSaxParser.f28932b;
                multipartUploadListing.getClass();
                return;
            }
            if (str.equals("UploadIdMarker")) {
                sb3.toString();
                Log log4 = XmlResponsesSaxParser.f28932b;
                multipartUploadListing.getClass();
                return;
            }
            if (str.equals("NextKeyMarker")) {
                sb3.toString();
                Log log5 = XmlResponsesSaxParser.f28932b;
                multipartUploadListing.getClass();
                return;
            }
            if (str.equals("NextUploadIdMarker")) {
                sb3.toString();
                Log log6 = XmlResponsesSaxParser.f28932b;
                multipartUploadListing.getClass();
                return;
            }
            if (str.equals("MaxUploads")) {
                Integer.parseInt(sb3.toString());
                multipartUploadListing.getClass();
                return;
            }
            if (str.equals("EncodingType")) {
                sb3.toString();
                Log log7 = XmlResponsesSaxParser.f28932b;
                multipartUploadListing.getClass();
            } else if (str.equals("IsTruncated")) {
                Boolean.parseBoolean(sb3.toString());
                multipartUploadListing.getClass();
            } else if (str.equals("Upload")) {
                if (multipartUploadListing.f28884a == null) {
                    multipartUploadListing.f28884a = new ArrayList();
                }
                multipartUploadListing.f28884a.add(this.f29019d);
                this.f29019d = null;
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void f(String str, Attributes attributes) {
            if (j("ListMultipartUploadsResult")) {
                if (str.equals("Upload")) {
                    this.f29019d = new MultipartUpload();
                }
            } else if (j("ListMultipartUploadsResult", "Upload")) {
                if (str.equals("Owner") || str.equals("Initiator")) {
                    this.f29020e = new Owner();
                }
            }
        }
    }

    public static class ListObjectsV2Handler extends AbstractHandler {

        /* renamed from: c, reason: collision with root package name */
        public S3ObjectSummary f29021c;

        /* renamed from: d, reason: collision with root package name */
        public Owner f29022d;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void e(String str) {
            if (this.f28931b.isEmpty()) {
                if (str.equals("ListBucketResult")) {
                    throw null;
                }
                return;
            }
            boolean j13 = j("ListBucketResult");
            StringBuilder sb3 = this.f28930a;
            if (j13) {
                if (str.equals("Name")) {
                    sb3.getClass();
                    throw null;
                }
                if (str.equals("Prefix")) {
                    sb3.toString();
                    Log log = XmlResponsesSaxParser.f28932b;
                    throw null;
                }
                if (str.equals("MaxKeys")) {
                    XmlResponsesSaxParser.b(sb3.toString());
                    throw null;
                }
                if (str.equals("NextContinuationToken")) {
                    sb3.getClass();
                    throw null;
                }
                if (str.equals("ContinuationToken")) {
                    sb3.getClass();
                    throw null;
                }
                if (str.equals("StartAfter")) {
                    sb3.getClass();
                    Log log2 = XmlResponsesSaxParser.f28932b;
                    throw null;
                }
                if (str.equals("KeyCount")) {
                    XmlResponsesSaxParser.b(sb3.toString());
                    throw null;
                }
                if (str.equals("Delimiter")) {
                    sb3.toString();
                    Log log3 = XmlResponsesSaxParser.f28932b;
                    throw null;
                }
                if (str.equals("EncodingType")) {
                    sb3.toString();
                    Log log4 = XmlResponsesSaxParser.f28932b;
                    throw null;
                }
                if (!str.equals("IsTruncated")) {
                    if (str.equals("Contents")) {
                        throw null;
                    }
                    return;
                }
                String a13 = StringUtils.a(sb3.toString());
                if (a13.startsWith("false")) {
                    throw null;
                }
                if (!a13.startsWith("true")) {
                    throw new IllegalStateException("Invalid value for IsTruncated field: ".concat(a13));
                }
                throw null;
            }
            if (!j("ListBucketResult", "Contents")) {
                if (!j("ListBucketResult", "Contents", "Owner")) {
                    if (j("ListBucketResult", "CommonPrefixes") && str.equals("Prefix")) {
                        throw null;
                    }
                    return;
                } else if (str.equals("ID")) {
                    this.f29022d.f28895b = sb3.toString();
                    return;
                } else {
                    if (str.equals("DisplayName")) {
                        this.f29022d.f28894a = sb3.toString();
                        return;
                    }
                    return;
                }
            }
            if (str.equals("Key")) {
                String sb4 = sb3.toString();
                S3ObjectSummary s3ObjectSummary = this.f29021c;
                Log log5 = XmlResponsesSaxParser.f28932b;
                s3ObjectSummary.f28907a = sb4;
                return;
            }
            if (str.equals("LastModified")) {
                S3ObjectSummary s3ObjectSummary2 = this.f29021c;
                String sb5 = sb3.toString();
                int i13 = ServiceUtils.f28822a;
                s3ObjectSummary2.f28910d = DateUtils.e(sb5);
                return;
            }
            if (str.equals("ETag")) {
                this.f29021c.f28908b = ServiceUtils.a(sb3.toString());
                return;
            }
            if (str.equals("Size")) {
                this.f29021c.f28909c = XmlResponsesSaxParser.c(sb3.toString());
            } else if (str.equals("StorageClass")) {
                this.f29021c.f28911e = sb3.toString();
            } else if (str.equals("Owner")) {
                this.f29021c.f28912f = this.f29022d;
                this.f29022d = null;
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void f(String str, Attributes attributes) {
            if (j("ListBucketResult")) {
                if (str.equals("Contents")) {
                    this.f29021c = new S3ObjectSummary();
                    throw null;
                }
            } else if (j("ListBucketResult", "Contents") && str.equals("Owner")) {
                this.f29022d = new Owner();
            }
        }
    }

    public static class ListPartsHandler extends AbstractHandler {

        /* renamed from: c, reason: collision with root package name */
        public final PartListing f29023c = new PartListing();

        /* renamed from: d, reason: collision with root package name */
        public PartSummary f29024d;

        /* renamed from: e, reason: collision with root package name */
        public Owner f29025e;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void e(String str) {
            boolean j13 = j("ListPartsResult");
            StringBuilder sb3 = this.f28930a;
            if (!j13) {
                if (!j("ListPartsResult", "Part")) {
                    if (j("ListPartsResult", "Owner") || j("ListPartsResult", "Initiator")) {
                        if (str.equals("ID")) {
                            this.f29025e.f28895b = XmlResponsesSaxParser.a(sb3.toString());
                            return;
                        } else {
                            if (str.equals("DisplayName")) {
                                this.f29025e.f28894a = XmlResponsesSaxParser.a(sb3.toString());
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                if (str.equals("PartNumber")) {
                    PartSummary partSummary = this.f29024d;
                    Integer.parseInt(sb3.toString());
                    partSummary.getClass();
                    return;
                }
                if (str.equals("LastModified")) {
                    PartSummary partSummary2 = this.f29024d;
                    String sb4 = sb3.toString();
                    int i13 = ServiceUtils.f28822a;
                    DateUtils.e(sb4);
                    partSummary2.getClass();
                    return;
                }
                if (str.equals("ETag")) {
                    PartSummary partSummary3 = this.f29024d;
                    ServiceUtils.a(sb3.toString());
                    partSummary3.getClass();
                    return;
                } else {
                    if (str.equals("Size")) {
                        PartSummary partSummary4 = this.f29024d;
                        Long.parseLong(sb3.toString());
                        partSummary4.getClass();
                        return;
                    }
                    return;
                }
            }
            boolean equals = str.equals("Bucket");
            PartListing partListing = this.f29023c;
            if (equals) {
                sb3.getClass();
                partListing.getClass();
                return;
            }
            if (str.equals("Key")) {
                sb3.getClass();
                partListing.getClass();
                return;
            }
            if (str.equals("UploadId")) {
                sb3.getClass();
                partListing.getClass();
                return;
            }
            if (str.equals("Owner")) {
                partListing.getClass();
                this.f29025e = null;
                return;
            }
            if (str.equals("Initiator")) {
                partListing.getClass();
                this.f29025e = null;
                return;
            }
            if (str.equals("StorageClass")) {
                sb3.getClass();
                partListing.getClass();
                return;
            }
            if (str.equals("PartNumberMarker")) {
                sb3.getClass();
                k().getClass();
                partListing.getClass();
                return;
            }
            if (str.equals("NextPartNumberMarker")) {
                sb3.getClass();
                k().getClass();
                partListing.getClass();
                return;
            }
            if (str.equals("MaxParts")) {
                sb3.getClass();
                k().getClass();
                partListing.getClass();
                return;
            }
            if (str.equals("EncodingType")) {
                sb3.toString();
                Log log = XmlResponsesSaxParser.f28932b;
                partListing.getClass();
            } else if (str.equals("IsTruncated")) {
                Boolean.parseBoolean(sb3.toString());
                partListing.getClass();
            } else if (str.equals("Part")) {
                if (partListing.f28898a == null) {
                    partListing.f28898a = new ArrayList();
                }
                partListing.f28898a.add(this.f29024d);
                this.f29024d = null;
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void f(String str, Attributes attributes) {
            if (j("ListPartsResult")) {
                if (str.equals("Part")) {
                    this.f29024d = new PartSummary();
                } else if (str.equals("Owner") || str.equals("Initiator")) {
                    this.f29025e = new Owner();
                }
            }
        }

        public final Integer k() {
            String a13 = XmlResponsesSaxParser.a(this.f28930a.toString());
            if (a13 == null) {
                return null;
            }
            return Integer.valueOf(Integer.parseInt(a13));
        }
    }

    public static class ListVersionsHandler extends AbstractHandler {

        /* renamed from: c, reason: collision with root package name */
        public S3VersionSummary f29026c;

        /* renamed from: d, reason: collision with root package name */
        public Owner f29027d;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void e(String str) {
            boolean j13 = j("ListVersionsResult");
            StringBuilder sb3 = this.f28930a;
            if (j13) {
                if (str.equals("Name")) {
                    sb3.getClass();
                    throw null;
                }
                if (str.equals("Prefix")) {
                    sb3.toString();
                    Log log = XmlResponsesSaxParser.f28932b;
                    throw null;
                }
                if (str.equals("KeyMarker")) {
                    sb3.toString();
                    Log log2 = XmlResponsesSaxParser.f28932b;
                    throw null;
                }
                if (str.equals("VersionIdMarker")) {
                    sb3.toString();
                    Log log3 = XmlResponsesSaxParser.f28932b;
                    throw null;
                }
                if (str.equals("MaxKeys")) {
                    Integer.parseInt(sb3.toString());
                    throw null;
                }
                if (str.equals("Delimiter")) {
                    sb3.toString();
                    Log log4 = XmlResponsesSaxParser.f28932b;
                    throw null;
                }
                if (str.equals("EncodingType")) {
                    sb3.toString();
                    Log log5 = XmlResponsesSaxParser.f28932b;
                    throw null;
                }
                if (str.equals("NextKeyMarker")) {
                    sb3.toString();
                    Log log6 = XmlResponsesSaxParser.f28932b;
                    throw null;
                }
                if (str.equals("NextVersionIdMarker")) {
                    sb3.getClass();
                    throw null;
                }
                if (str.equals("IsTruncated")) {
                    "true".equals(sb3.toString());
                    throw null;
                }
                if (str.equals("Version")) {
                    throw null;
                }
                if (str.equals("DeleteMarker")) {
                    throw null;
                }
                return;
            }
            if (j("ListVersionsResult", "CommonPrefixes")) {
                if (str.equals("Prefix")) {
                    sb3.toString();
                    Log log7 = XmlResponsesSaxParser.f28932b;
                    throw null;
                }
                return;
            }
            if (!j("ListVersionsResult", "Version") && !j("ListVersionsResult", "DeleteMarker")) {
                if (j("ListVersionsResult", "Version", "Owner") || j("ListVersionsResult", "DeleteMarker", "Owner")) {
                    if (str.equals("ID")) {
                        this.f29027d.f28895b = sb3.toString();
                        return;
                    } else {
                        if (str.equals("DisplayName")) {
                            this.f29027d.f28894a = sb3.toString();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (str.equals("Key")) {
                sb3.getClass();
                S3VersionSummary s3VersionSummary = this.f29026c;
                Log log8 = XmlResponsesSaxParser.f28932b;
                s3VersionSummary.getClass();
                return;
            }
            if (str.equals("VersionId")) {
                S3VersionSummary s3VersionSummary2 = this.f29026c;
                sb3.getClass();
                s3VersionSummary2.getClass();
                return;
            }
            if (str.equals("IsLatest")) {
                S3VersionSummary s3VersionSummary3 = this.f29026c;
                "true".equals(sb3.toString());
                s3VersionSummary3.getClass();
                return;
            }
            if (str.equals("LastModified")) {
                S3VersionSummary s3VersionSummary4 = this.f29026c;
                String sb4 = sb3.toString();
                int i13 = ServiceUtils.f28822a;
                DateUtils.e(sb4);
                s3VersionSummary4.getClass();
                return;
            }
            if (str.equals("ETag")) {
                S3VersionSummary s3VersionSummary5 = this.f29026c;
                ServiceUtils.a(sb3.toString());
                s3VersionSummary5.getClass();
            } else if (str.equals("Size")) {
                S3VersionSummary s3VersionSummary6 = this.f29026c;
                Long.parseLong(sb3.toString());
                s3VersionSummary6.getClass();
            } else if (str.equals("Owner")) {
                this.f29026c.getClass();
                this.f29027d = null;
            } else if (str.equals("StorageClass")) {
                S3VersionSummary s3VersionSummary7 = this.f29026c;
                sb3.getClass();
                s3VersionSummary7.getClass();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void f(String str, Attributes attributes) {
            if (!j("ListVersionsResult")) {
                if ((j("ListVersionsResult", "Version") || j("ListVersionsResult", "DeleteMarker")) && str.equals("Owner")) {
                    this.f29027d = new Owner();
                    return;
                }
                return;
            }
            if (str.equals("Version")) {
                this.f29026c = new S3VersionSummary();
                throw null;
            }
            if (str.equals("DeleteMarker")) {
                this.f29026c = new S3VersionSummary();
                throw null;
            }
        }
    }

    public static class RequestPaymentConfigurationHandler extends AbstractHandler {
        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void e(String str) {
            if (j("RequestPaymentConfiguration") && str.equals("Payer")) {
                this.f28930a.getClass();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void f(String str, Attributes attributes) {
        }
    }

    public XmlResponsesSaxParser() {
        this.f28933a = null;
        try {
            this.f28933a = XMLReaderFactory.createXMLReader();
        } catch (SAXException e13) {
            System.setProperty("org.xml.sax.driver", "org.xmlpull.v1.sax2.Driver");
            try {
                this.f28933a = XMLReaderFactory.createXMLReader();
            } catch (SAXException unused) {
                throw new AmazonClientException("Couldn't initialize a sax driver for the XMLReader", e13);
            }
        }
    }

    public static String a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    public static void b(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e13) {
            f28932b.d(a.k("Unable to parse integer value '", str, "'"), e13);
        }
    }

    public static long c(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e13) {
            f28932b.d(a.k("Unable to parse long value '", str, "'"), e13);
            return -1L;
        }
    }

    public final void d(DefaultHandler defaultHandler, InputStream inputStream) {
        XMLReader xMLReader = this.f28933a;
        Log log = f28932b;
        try {
            if (log.b()) {
                log.f("Parsing XML response document with handler: " + defaultHandler.getClass());
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            xMLReader.setContentHandler(defaultHandler);
            xMLReader.setErrorHandler(defaultHandler);
            xMLReader.parse(new InputSource(bufferedReader));
        } catch (IOException e13) {
            throw e13;
        } catch (Throwable th3) {
            try {
                inputStream.close();
            } catch (IOException e14) {
                if (log.e()) {
                    log.d("Unable to close response InputStream up after XML parse failure", e14);
                }
            }
            throw new AmazonClientException("Failed to parse XML document with handler " + defaultHandler.getClass(), th3);
        }
    }
}
