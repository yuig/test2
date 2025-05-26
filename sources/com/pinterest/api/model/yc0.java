package com.pinterest.api.model;

import com.pinterest.api.model.deserializer.PinDeserializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class yc0 extends qz.d {

    /* renamed from: i, reason: collision with root package name */
    public final String f44008i;

    /* renamed from: j, reason: collision with root package name */
    public final List f44009j;

    /* renamed from: k, reason: collision with root package name */
    public final List f44010k;

    public yc0(vd0.c cVar, String str, PinDeserializer pinDeserializer) {
        super(cVar);
        this.f44008i = str;
        if (cVar == null || pinDeserializer == null) {
            return;
        }
        ArrayList j13 = j(pinDeserializer);
        Intrinsics.checkNotNullParameter(j13, "<set-?>");
        this.f44010k = j13;
        ArrayList j14 = j(pinDeserializer);
        ArrayList arrayList = new ArrayList();
        Iterator it = j14.iterator();
        while (it.hasNext()) {
            v7 D3 = ((f30) it.next()).D3();
            if (D3 != null) {
                arrayList.add(D3);
            }
        }
        ArrayList H0 = CollectionsKt.H0(arrayList);
        Intrinsics.checkNotNullParameter(H0, "<set-?>");
        this.f44009j = H0;
        gw gwVar = fw.f37821a;
        List<v7> h10 = h();
        gwVar.getClass();
        for (v7 v7Var : h10) {
            if (gwVar.f38163b == null) {
                gwVar.f38163b = new x9();
            }
            gwVar.f38163b.getClass();
            if (x9.c(v7Var)) {
                ew.g(v7Var);
            }
        }
    }

    public final List h() {
        List list = this.f44009j;
        if (list != null) {
            return list;
        }
        Intrinsics.r("boards");
        throw null;
    }

    public final ArrayList j(PinDeserializer pinDeserializer) {
        vh.a aVar = new vh.a(pinDeserializer);
        ArrayList arrayList = new ArrayList();
        Object obj = this.f105381a;
        vd0.a aVar2 = obj instanceof vd0.a ? (vd0.a) obj : null;
        if (aVar2 != null) {
            Iterator it = aVar2.iterator();
            while (it.hasNext()) {
                vd0.c m13 = ((vd0.c) it.next()).m("pin");
                if (m13 != null) {
                    arrayList.add(aVar.b(m13));
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yc0(@NotNull List<v7> boards) {
        this(null, null, null);
        Intrinsics.checkNotNullParameter(boards, "boards");
        Intrinsics.checkNotNullParameter(boards, "<set-?>");
        this.f44009j = boards;
    }
}
