package com.pinterest.shuffles.scene.composer;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r72.z1;

/* loaded from: classes4.dex */
public final class l extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final l f52078j = new l(0);

    /* renamed from: k, reason: collision with root package name */
    public static final l f52079k = new l(1);

    /* renamed from: l, reason: collision with root package name */
    public static final l f52080l = new l(2);

    /* renamed from: m, reason: collision with root package name */
    public static final l f52081m = new l(3);

    /* renamed from: n, reason: collision with root package name */
    public static final l f52082n = new l(4);

    /* renamed from: o, reason: collision with root package name */
    public static final l f52083o = new l(5);

    /* renamed from: p, reason: collision with root package name */
    public static final l f52084p = new l(6);

    /* renamed from: q, reason: collision with root package name */
    public static final l f52085q = new l(7);

    /* renamed from: r, reason: collision with root package name */
    public static final l f52086r = new l(8);

    /* renamed from: s, reason: collision with root package name */
    public static final l f52087s = new l(9);

    /* renamed from: t, reason: collision with root package name */
    public static final l f52088t = new l(10);

    /* renamed from: u, reason: collision with root package name */
    public static final l f52089u = new l(11);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f52090i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i13) {
        super(1);
        this.f52090i = i13;
    }

    public final Object b(z1 hasChanges) {
        switch (this.f52090i) {
            case 1:
                Intrinsics.checkNotNullParameter(hasChanges, "$this$hasChanges");
                return Boolean.valueOf(hasChanges.a().f106516d);
            case 2:
                Intrinsics.checkNotNullParameter(hasChanges, "$this$hasChanges");
                return hasChanges.a().f106518f;
            case 3:
                Intrinsics.checkNotNullParameter(hasChanges, "$this$hasChanges");
                return hasChanges.a().f106519g;
            case 4:
                Intrinsics.checkNotNullParameter(hasChanges, "$this$hasChanges");
                return hasChanges.a().f106520h;
            case 5:
                Intrinsics.checkNotNullParameter(hasChanges, "$this$hasChanges");
                return hasChanges.a().f106521i;
            case 6:
                Intrinsics.checkNotNullParameter(hasChanges, "$this$hasChanges");
                return Boolean.valueOf(hasChanges.a().f106514b);
            case 7:
                Intrinsics.checkNotNullParameter(hasChanges, "$this$hasChanges");
                return Boolean.valueOf(hasChanges.a().f106513a);
            case 8:
                Intrinsics.checkNotNullParameter(hasChanges, "$this$hasChanges");
                return Double.valueOf(hasChanges.a().f106523k);
            case 9:
                Intrinsics.checkNotNullParameter(hasChanges, "$this$hasChanges");
                return Double.valueOf(hasChanges.a().f106524l);
            case 10:
                Intrinsics.checkNotNullParameter(hasChanges, "$this$hasChanges");
                return Float.valueOf(hasChanges.a().f106517e);
            default:
                Intrinsics.checkNotNullParameter(hasChanges, "$this$hasChanges");
                return Boolean.valueOf(hasChanges.a().f106515c);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f52090i) {
            case 0:
                Collection it = (Collection) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return b((z1) obj);
    }
}
