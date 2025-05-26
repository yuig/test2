package com.pinterest.shuffles.scene.composer;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r72.a2;
import r72.u1;
import r72.y1;
import r72.z1;

/* loaded from: classes4.dex */
public final class d0 extends androidx.recyclerview.widget.a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f52029b = new d0();

    public static i k(z1 oldItem, z1 newItem) {
        boolean z13;
        boolean z14;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        boolean z15 = false;
        Function1[] function1Arr = {new kotlin.jvm.internal.d0() { // from class: com.pinterest.shuffles.scene.composer.a0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((z1) obj).c();
            }
        }, new kotlin.jvm.internal.d0() { // from class: com.pinterest.shuffles.scene.composer.b0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return Double.valueOf(((z1) obj).e());
            }
        }, new kotlin.jvm.internal.d0() { // from class: com.pinterest.shuffles.scene.composer.c0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return Double.valueOf(((z1) obj).d());
            }
        }, l.f52084p, l.f52085q, l.f52086r, l.f52087s};
        int i13 = 0;
        while (true) {
            if (i13 >= 7) {
                z13 = false;
                break;
            }
            Function1 function1 = function1Arr[i13];
            if (!Intrinsics.d(function1.invoke(oldItem), function1.invoke(newItem))) {
                z13 = true;
                break;
            }
            i13++;
        }
        Function1[] function1Arr2 = {l.f52088t, l.f52089u, l.f52079k, l.f52080l, l.f52081m, l.f52082n, l.f52083o};
        int i14 = 0;
        while (true) {
            if (i14 >= 7) {
                z14 = false;
                break;
            }
            Function1 function12 = function1Arr2[i14];
            if (!Intrinsics.d(function12.invoke(oldItem), function12.invoke(newItem))) {
                z14 = true;
                break;
            }
            i14++;
        }
        boolean z16 = (oldItem instanceof u1) && (newItem instanceof u1) && !Intrinsics.d(((u1) oldItem).f106675g, ((u1) newItem).f106675g);
        if ((oldItem instanceof y1) && (newItem instanceof y1) && !Intrinsics.d(((y1) oldItem).f106726f, ((y1) newItem).f106726f)) {
            z15 = true;
        }
        return new i(z13, z14, z16, z15);
    }

    @Override // androidx.recyclerview.widget.a0
    public final boolean b(Object obj, Object obj2) {
        z1 oldItem = (z1) obj;
        z1 newItem = (z1) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.a0
    public final boolean d(Object obj, Object obj2) {
        z1 oldItem = (z1) obj;
        z1 newItem = (z1) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        String b13 = oldItem.b();
        String b14 = newItem.b();
        int i13 = a2.f106437b;
        return Intrinsics.d(b13, b14);
    }

    @Override // androidx.recyclerview.widget.a0
    public final /* bridge */ /* synthetic */ Object g(Object obj, Object obj2) {
        return k((z1) obj, (z1) obj2);
    }
}
