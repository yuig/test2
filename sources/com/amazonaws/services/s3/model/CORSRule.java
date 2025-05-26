package com.amazonaws.services.s3.model;

import a.a;
import java.util.List;

/* loaded from: classes3.dex */
public class CORSRule {

    /* renamed from: a, reason: collision with root package name */
    public List f28860a;

    /* renamed from: b, reason: collision with root package name */
    public List f28861b;

    /* renamed from: c, reason: collision with root package name */
    public List f28862c;

    /* renamed from: d, reason: collision with root package name */
    public List f28863d;

    public enum AllowedMethods {
        GET("GET"),
        PUT("PUT"),
        HEAD("HEAD"),
        POST("POST"),
        DELETE("DELETE");

        private final String AllowedMethod;

        AllowedMethods(String str) {
            this.AllowedMethod = str;
        }

        public static AllowedMethods fromValue(String str) {
            for (AllowedMethods allowedMethods : values()) {
                String allowedMethods2 = allowedMethods.toString();
                if (allowedMethods2 == null && str == null) {
                    return allowedMethods;
                }
                if (allowedMethods2 != null && allowedMethods2.equals(str)) {
                    return allowedMethods;
                }
            }
            throw new IllegalArgumentException(a.k("Cannot create enum from ", str, " value!"));
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.AllowedMethod;
        }
    }
}
