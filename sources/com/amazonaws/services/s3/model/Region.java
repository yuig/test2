package com.amazonaws.services.s3.model;

import a.a;
import com.amazonaws.regions.RegionUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public enum Region {
    US_Standard(null),
    US_East_2("us-east-2"),
    US_West("us-west-1"),
    US_West_2("us-west-2"),
    US_GovCloud("s3-us-gov-west-1"),
    US_Gov_East_1("s3-us-gov-east-1"),
    EU_Ireland("eu-west-1", "EU"),
    EU_London("eu-west-2"),
    EU_Paris("eu-west-3"),
    EU_Frankfurt("eu-central-1"),
    EU_Zurich("eu-central-2"),
    EU_Stockholm("eu-north-1"),
    AP_HongKong("ap-east-1"),
    AP_Mumbai("ap-south-1"),
    AP_Singapore("ap-southeast-1"),
    AP_Sydney("ap-southeast-2"),
    AP_Tokyo("ap-northeast-1"),
    AP_Seoul("ap-northeast-2"),
    SA_SaoPaulo("sa-east-1"),
    CA_Montreal("ca-central-1"),
    CN_Beijing("cn-north-1"),
    CN_Ningxia("cn-northwest-1"),
    ME_Bahrain("me-south-1"),
    EU_Milan("eu-south-1"),
    EU_Spain("eu-south-2"),
    AP_CapeTown("af-south-1"),
    AP_Jakarta("ap-southeast-3"),
    ME_UAE("me-central-1"),
    AP_HYD("ap-south-2"),
    AP_Melbourne("ap-southeast-4"),
    AP_TelAviv("il-central-1"),
    CA_Calgary("ca-west-1");

    public static final Pattern S3_REGIONAL_ENDPOINT_PATTERN = Pattern.compile("s3[-.]([^.]+)\\.amazonaws\\.com(\\.[^.]*)?");
    private final List<String> regionIds;

    Region(String... strArr) {
        this.regionIds = strArr != null ? Arrays.asList(strArr) : null;
    }

    public static Region fromValue(String str) {
        if (str == null || str.equals("US") || str.equals("us-east-1")) {
            return US_Standard;
        }
        for (Region region : values()) {
            List<String> list = region.regionIds;
            if (list != null && list.contains(str)) {
                return region;
            }
        }
        throw new IllegalArgumentException(a.k("Cannot create enum from ", str, " value!"));
    }

    private String getFirstRegionId0() {
        List<String> list = this.regionIds;
        if (list == null || list.size() == 0) {
            return null;
        }
        return this.regionIds.get(0);
    }

    public String getFirstRegionId() {
        return getFirstRegionId0();
    }

    public com.amazonaws.regions.Region toAWSRegion() {
        ArrayList arrayList;
        String firstRegionId = getFirstRegionId();
        if (firstRegionId != null) {
            return RegionUtils.a(firstRegionId);
        }
        String host = RegionUtils.b("s3.amazonaws.com").getHost();
        synchronized (RegionUtils.class) {
            try {
                if (RegionUtils.f28760a == null) {
                    RegionUtils.c();
                }
                arrayList = RegionUtils.f28760a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.amazonaws.regions.Region region = (com.amazonaws.regions.Region) it.next();
            Iterator it2 = region.f28757c.values().iterator();
            while (it2.hasNext()) {
                if (RegionUtils.b((String) it2.next()).getHost().equals(host)) {
                    return region;
                }
            }
        }
        throw new IllegalArgumentException("No region found with any service for endpoint s3.amazonaws.com");
    }

    @Override // java.lang.Enum
    public String toString() {
        return getFirstRegionId0();
    }
}
