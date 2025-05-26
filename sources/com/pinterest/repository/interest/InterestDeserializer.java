package com.pinterest.repository.interest;

import c0.d;
import com.pinterest.api.model.et;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.gw;
import com.pinterest.api.model.zs;
import com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge;
import dl1.l;
import dl1.s;
import dl1.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ke0.b;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import se2.a;
import vd0.c;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/repository/interest/InterestDeserializer;", "Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;", "Lcom/pinterest/api/model/zs;", "Lke0/b;", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class InterestDeserializer extends ModelDeserializerWithSaveAndMerge<zs> implements b {

    /* renamed from: b, reason: collision with root package name */
    public final a f50454b;

    /* renamed from: c, reason: collision with root package name */
    public final gw f50455c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestDeserializer(a lazyInterestRepository, gw modelHelper) {
        super("interest");
        Intrinsics.checkNotNullParameter(lazyInterestRepository, "lazyInterestRepository");
        Intrinsics.checkNotNullParameter(modelHelper, "modelHelper");
        Intrinsics.checkNotNullParameter("interest", "jsonType");
        this.f50454b = lazyInterestRepository;
        this.f50455c = modelHelper;
    }

    @Override // ke0.b
    public final List a(vd0.a arr, boolean z13) {
        Intrinsics.checkNotNullParameter(arr, "arr");
        int d2 = arr.d();
        ArrayList arrayList = new ArrayList(d2);
        ArrayList arrayList2 = new ArrayList(d2);
        int d13 = arr.d();
        for (int i13 = 0; i13 < d13; i13++) {
            c json = arr.j(i13);
            Intrinsics.checkNotNullExpressionValue(json, "optJsonObject(...)");
            Intrinsics.checkNotNullParameter(json, "json");
            zs e13 = e(json, false, false);
            arrayList.add(e13);
            arrayList2.add(e13.getUid());
        }
        if (z13) {
            gw gwVar = this.f50455c;
            gwVar.getClass();
            ArrayList c13 = gw.c(arrayList2);
            if (!(!c13.isEmpty())) {
                c13 = null;
            }
            if (c13 != null) {
                arrayList = d.o2(arrayList, c13);
            }
            Iterator it = CollectionsKt.H0(arrayList).iterator();
            while (it.hasNext()) {
                zs zsVar = (zs) it.next();
                if (gwVar.f38162a == null) {
                    gwVar.f38162a = new et();
                }
                gwVar.f38162a.getClass();
                if (et.c(zsVar)) {
                    ew.j(zsVar);
                }
            }
        }
        return arrayList;
    }

    @Override // ke0.b
    public final List c(vd0.a arr) {
        Intrinsics.checkNotNullParameter(arr, "arr");
        return a(arr, true);
    }

    @Override // ke0.a
    public final s d(c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return e(json, false, false);
    }

    @Override // com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final zs e(c json, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(json, "json");
        Object e13 = c.f125622b.e(json.f125623a, zs.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.Interest");
        zs zsVar = (zs) e13;
        if (z14) {
            t tVar = (t) ((bf2.b) this.f50454b).get();
            String uid = zsVar.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            zs zsVar2 = (zs) ((l) tVar).O(uid);
            if (zsVar2 != null) {
                zsVar = zsVar2.a(zsVar);
                Intrinsics.checkNotNullExpressionValue(zsVar, "mergeFrom(...)");
            }
        }
        if (z13) {
            gw gwVar = this.f50455c;
            if (gwVar.f38162a == null) {
                gwVar.f38162a = new et();
            }
            gwVar.f38162a.getClass();
            if (et.c(zsVar)) {
                ew.j(zsVar);
            }
        }
        return zsVar;
    }
}
