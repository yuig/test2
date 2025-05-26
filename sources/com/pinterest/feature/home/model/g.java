package com.pinterest.feature.home.model;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import x02.r1;

/* loaded from: classes.dex */
public class g extends uq0.a {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f45792e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f45793f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f45794g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f45795h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f45796i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f45797j;

    public /* synthetic */ g(r1 r1Var, boolean z13, String str, boolean z14, int i13) {
        this(r1Var, (i13 & 2) != 0 ? false : z13, false, null, (i13 & 16) != 0 ? "" : str, (i13 & 32) != 0 ? false : z14);
    }

    public final String toString() {
        String str = a() ? "INITIAL" : "NEXT";
        String str2 = this.f123038d;
        Intrinsics.checkNotNullExpressionValue(str2, "getNextRequestUrl(...)");
        if (str2.length() == 0) {
            str2 = "EMPTY";
        } else {
            Intrinsics.checkNotNullExpressionValue(str2, "getNextRequestUrl(...)");
        }
        boolean z13 = this.f55251a;
        StringBuilder w13 = a.a.w("HomeFeedRequestParams {pageRequestType=", str, ", nextRequestUrl=", str2, ", shouldOnlyFetchRemote=");
        w13.append(this.f45793f);
        w13.append(", shouldAlwaysFetchRemote=");
        w13.append(z13);
        w13.append(" }");
        return w13.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r1 requestType, boolean z13, boolean z14, Map map, String nextRequestUrl, boolean z15) {
        super(nextRequestUrl.length() == 0 ? 1 : 2, nextRequestUrl);
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(nextRequestUrl, "nextRequestUrl");
        r1 r1Var = r1.REQUEST_TYPE_ALWAYS_REMOTE;
        boolean z16 = r1Var != requestType;
        boolean z17 = r1.REQUEST_TYPE_ONLY_REMOTE == requestType;
        Intrinsics.checkNotNullParameter(nextRequestUrl, "nextRequestUrl");
        this.f45792e = z16;
        this.f45793f = z17;
        this.f45794g = z13;
        this.f45795h = z14;
        this.f45796i = map;
        this.f45797j = z15;
        this.f55251a = r1Var == requestType;
    }
}
