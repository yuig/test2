package com.amazonaws;

import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.util.VersionInfoUtils;

/* loaded from: classes3.dex */
public class ClientConfiguration {

    /* renamed from: g, reason: collision with root package name */
    public static final String f28523g;

    /* renamed from: h, reason: collision with root package name */
    public static final RetryPolicy f28524h;

    /* renamed from: a, reason: collision with root package name */
    public final String f28525a = f28523g;

    /* renamed from: b, reason: collision with root package name */
    public int f28526b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final RetryPolicy f28527c = f28524h;

    /* renamed from: d, reason: collision with root package name */
    public final Protocol f28528d = Protocol.HTTPS;

    /* renamed from: e, reason: collision with root package name */
    public int f28529e = 15000;

    /* renamed from: f, reason: collision with root package name */
    public int f28530f = 15000;

    static {
        if (VersionInfoUtils.f29053a == null) {
            synchronized (VersionInfoUtils.class) {
                try {
                    if (VersionInfoUtils.f29053a == null) {
                        VersionInfoUtils.a();
                    }
                } finally {
                }
            }
        }
        f28523g = VersionInfoUtils.f29053a;
        f28524h = PredefinedRetryPolicies.f28763b;
    }
}
