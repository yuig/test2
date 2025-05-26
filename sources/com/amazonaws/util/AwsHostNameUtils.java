package com.amazonaws.util;

import com.amazonaws.internal.config.HostRegexToRegionMapping;
import com.amazonaws.internal.config.InternalConfig;
import java.util.Collections;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public abstract class AwsHostNameUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f29034a = Pattern.compile("^(?:.+\\.)?s3[.-]([a-z0-9-]+)$");

    public static String a(String str, String str2) {
        String str3;
        if (str == null) {
            throw new IllegalArgumentException("hostname cannot be null");
        }
        Iterator it = Collections.unmodifiableList(InternalConfig.Factory.f28623a.f28622f).iterator();
        while (true) {
            if (!it.hasNext()) {
                str3 = null;
                break;
            }
            HostRegexToRegionMapping hostRegexToRegionMapping = (HostRegexToRegionMapping) it.next();
            if (str.matches(hostRegexToRegionMapping.f28614a)) {
                str3 = hostRegexToRegionMapping.f28615b;
                break;
            }
        }
        if (str3 != null) {
            return str3;
        }
        if (str.endsWith(".amazonaws.com")) {
            return b(str.substring(0, str.length() - 14));
        }
        if (str.endsWith(".amazonaws.com.cn")) {
            return b(str.substring(0, str.length() - 17));
        }
        if (str2 == null) {
            return "us-east-1";
        }
        Matcher matcher = Pattern.compile("^(?:.+\\.)?" + Pattern.quote(str2) + "[.-]([a-z0-9-]+)\\.").matcher(str);
        return matcher.find() ? matcher.group(1) : "us-east-1";
    }

    public static String b(String str) {
        Matcher matcher = f29034a.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return "us-east-1";
        }
        String substring = str.substring(lastIndexOf + 1);
        if (substring.equals("vpce")) {
            String[] split = str.split("\\.");
            if (split.length < 2) {
                return "us-east-1";
            }
            substring = split[split.length - 2];
        }
        return "us-gov".equals(substring) ? "us-gov-west-1" : substring;
    }
}
