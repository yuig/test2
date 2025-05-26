package com.pinterest.api.model;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class qq {

    /* renamed from: a, reason: collision with root package name */
    public final transient rq f41353a;

    /* renamed from: b, reason: collision with root package name */
    public final transient tq f41354b;

    public /* synthetic */ qq(rq rqVar, tq tqVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(rqVar, tqVar);
    }

    public abstract qq a(rq rqVar, tq tqVar);

    /* renamed from: b */
    public rq getConfig() {
        return this.f41353a;
    }

    /* renamed from: c */
    public tq getDurationConfig() {
        return this.f41354b;
    }

    public abstract qq d(Function1 function1);

    public abstract qq e(Function1 function1);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.d(getClass(), obj.getClass())) {
            return false;
        }
        qq qqVar = (qq) obj;
        return Intrinsics.d(getConfig(), qqVar.getConfig()) && Intrinsics.d(getDurationConfig(), qqVar.getDurationConfig());
    }

    private qq(rq rqVar, tq tqVar) {
        this.f41353a = rqVar;
        this.f41354b = tqVar;
    }
}
