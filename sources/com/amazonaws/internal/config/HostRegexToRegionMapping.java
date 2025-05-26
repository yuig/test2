package com.amazonaws.internal.config;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes3.dex */
public class HostRegexToRegionMapping {

    /* renamed from: a, reason: collision with root package name */
    public final String f28614a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28615b;

    public HostRegexToRegionMapping(String str, String str2) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Invalid HostRegexToRegionMapping configuration: hostNameRegex must be non-empty");
        }
        try {
            Pattern.compile(str);
            if (str2.isEmpty()) {
                throw new IllegalArgumentException("Invalid HostRegexToRegionMapping configuration: regionName must be non-empty");
            }
            this.f28614a = str;
            this.f28615b = str2;
        } catch (PatternSyntaxException e13) {
            throw new IllegalArgumentException("Invalid HostRegexToRegionMapping configuration: hostNameRegex is not a valid regex", e13);
        }
    }
}
