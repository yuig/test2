package com.pinterest.framework.multisection.datasource.pagedlist;

import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f49067j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f49068k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f49069l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f49070m = new a(3);

    /* renamed from: n, reason: collision with root package name */
    public static final a f49071n = new a(4);

    /* renamed from: o, reason: collision with root package name */
    public static final a f49072o = new a(5);

    /* renamed from: p, reason: collision with root package name */
    public static final a f49073p = new a(6);

    /* renamed from: q, reason: collision with root package name */
    public static final a f49074q = new a(7);

    /* renamed from: r, reason: collision with root package name */
    public static final a f49075r = new a(8);

    /* renamed from: s, reason: collision with root package name */
    public static final a f49076s = new a(9);

    /* renamed from: t, reason: collision with root package name */
    public static final a f49077t = new a(10);

    /* renamed from: u, reason: collision with root package name */
    public static final a f49078u = new a(11);

    /* renamed from: v, reason: collision with root package name */
    public static final a f49079v = new a(12);

    /* renamed from: w, reason: collision with root package name */
    public static final a f49080w = new a(13);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f49081i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f49081i = i13;
    }

    public final Boolean b(wt1.c0 it) {
        boolean z13 = true;
        switch (this.f49081i) {
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof wt1.v) && it.f131095a == null && !(it instanceof wt1.j) && !(it instanceof wt1.z)) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof wt1.v) && it.f131095a == null && !(it instanceof wt1.j) && !(it instanceof wt1.z)) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
        }
    }

    public final void e(Throwable th3) {
        switch (this.f49081i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                break;
            case 6:
            case 7:
            case 10:
            default:
                HashSet hashSet = tb0.h.f117076w;
                tb0.h hVar = tb0.g.f117075a;
                hVar.h("RetrofitPagedRemoteRequest error: " + th3 + ". This has also been logged as a non-fatal exception.");
                hVar.q(th3, "RetrofitPagedRemoteRequest error", tb0.p.PLATFORM);
                break;
            case 9:
                HashSet hashSet2 = tb0.h.f117076w;
                tb0.g.f117075a.o("HeaderFooterWrappedList observeDataSourceUpdates() error", th3);
                break;
            case 11:
            case 12:
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f49081i) {
            case 0:
                List list = (List) obj;
                Intrinsics.checkNotNullParameter(list, "list");
                if (!(CollectionsKt.d0(list) instanceof gb2.i)) {
                    break;
                } else {
                    break;
                }
            case 1:
                List it = (List) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 2:
                e((Throwable) obj);
                break;
            case 3:
                e((Throwable) obj);
                break;
            case 4:
                e((Throwable) obj);
                break;
            case 5:
                e((Throwable) obj);
                break;
            case 6:
                Intrinsics.checkNotNullParameter((String) obj, "it");
                break;
            case 7:
                break;
            case 8:
                e((Throwable) obj);
                break;
            case 9:
                e((Throwable) obj);
                break;
            case 10:
                break;
            case 11:
                e((Throwable) obj);
                break;
            case 12:
                e((Throwable) obj);
                break;
            default:
                e((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
