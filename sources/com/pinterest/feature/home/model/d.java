package com.pinterest.feature.home.model;

import dl1.m;
import dl1.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45780a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f45781b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f45782c;

    public /* synthetic */ d(q0 q0Var, m mVar, int i13) {
        this.f45780a = i13;
        this.f45781b = q0Var;
        this.f45782c = mVar;
    }

    @Override // ak2.a
    public final void run() {
        int i13 = this.f45780a;
        m params = this.f45782c;
        q0 this$0 = this.f45781b;
        switch (i13) {
            case 0:
                f this$02 = (f) this$0;
                g requestParams = (g) params;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(requestParams, "$requestParams");
                this$02.L("fetch()", "doOnComplete", requestParams);
                break;
            case 1:
                f this$03 = (f) this$0;
                g requestParams2 = (g) params;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(requestParams2, "$requestParams");
                this$03.L("fetch()", "doOnDispose", requestParams2);
                break;
            case 2:
                f this$04 = (f) this$0;
                g localRequestParams = (g) params;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(localRequestParams, "$localRequestParams");
                this$04.L("getFromLocalDataSource()", "doOnComplete", localRequestParams);
                break;
            case 3:
                f this$05 = (f) this$0;
                g localRequestParams2 = (g) params;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(localRequestParams2, "$localRequestParams");
                this$05.L("getFromLocalDataSource()", "doOnDispose", localRequestParams2);
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(params, "$params");
                this$0.f55282o.remove(params);
                break;
        }
    }
}
