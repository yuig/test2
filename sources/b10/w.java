package b10;

import com.pinterest.api.model.dl0;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.gn;
import com.pinterest.api.model.oe0;
import com.pinterest.api.model.pz0;
import com.pinterest.api.model.se0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import x40.ah;
import x40.bh;
import x40.dh;
import x40.fh;
import x40.hh;
import x40.jh;
import x40.lh;
import x40.mh;
import x40.og;
import x40.pg;
import x40.rg;
import x40.vg;
import x40.yg;

/* loaded from: classes3.dex */
public final class w implements uf0.a {

    /* renamed from: a, reason: collision with root package name */
    public final uf0.b f20942a;

    /* renamed from: b, reason: collision with root package name */
    public final uf0.b f20943b;

    /* renamed from: c, reason: collision with root package name */
    public final uf0.b f20944c;

    /* renamed from: d, reason: collision with root package name */
    public final uf0.b f20945d;

    /* renamed from: e, reason: collision with root package name */
    public final uf0.b f20946e;

    /* renamed from: f, reason: collision with root package name */
    public final uf0.b f20947f;

    /* renamed from: g, reason: collision with root package name */
    public final uf0.b f20948g;

    /* renamed from: h, reason: collision with root package name */
    public final uf0.b f20949h;

    /* renamed from: i, reason: collision with root package name */
    public final uf0.b f20950i;

    /* renamed from: j, reason: collision with root package name */
    public final uf0.b f20951j;

    /* renamed from: k, reason: collision with root package name */
    public final uf0.b f20952k;

    /* renamed from: l, reason: collision with root package name */
    public final uf0.b f20953l;

    public w(a10.h embedAdapter, a10.h pinnedToBoardAdapter, a10.h storyPinDataAdapter, a10.h richMetadataAdapter, a10.h richSummaryAdapter, a10.h nativeCreatorAdapter, a10.h pinnerAdapter, a10.h thirdPartyPinOwnerAdapter, a10.h linkUserWebsiteAdapter, a10.h linkDomainAdapter, a10.g imageMediumDetailsAdapter, a10.g imageLargeDetailsAdapter) {
        Intrinsics.checkNotNullParameter(embedAdapter, "embedAdapter");
        Intrinsics.checkNotNullParameter(pinnedToBoardAdapter, "pinnedToBoardAdapter");
        Intrinsics.checkNotNullParameter(storyPinDataAdapter, "storyPinDataAdapter");
        Intrinsics.checkNotNullParameter(richMetadataAdapter, "richMetadataAdapter");
        Intrinsics.checkNotNullParameter(richSummaryAdapter, "richSummaryAdapter");
        Intrinsics.checkNotNullParameter(nativeCreatorAdapter, "nativeCreatorAdapter");
        Intrinsics.checkNotNullParameter(pinnerAdapter, "pinnerAdapter");
        Intrinsics.checkNotNullParameter(thirdPartyPinOwnerAdapter, "thirdPartyPinOwnerAdapter");
        Intrinsics.checkNotNullParameter(linkUserWebsiteAdapter, "linkUserWebsiteAdapter");
        Intrinsics.checkNotNullParameter(linkDomainAdapter, "linkDomainAdapter");
        Intrinsics.checkNotNullParameter(imageMediumDetailsAdapter, "imageMediumDetailsAdapter");
        Intrinsics.checkNotNullParameter(imageLargeDetailsAdapter, "imageLargeDetailsAdapter");
        this.f20942a = embedAdapter;
        this.f20943b = pinnedToBoardAdapter;
        this.f20944c = storyPinDataAdapter;
        this.f20945d = richMetadataAdapter;
        this.f20946e = richSummaryAdapter;
        this.f20947f = nativeCreatorAdapter;
        this.f20948g = pinnerAdapter;
        this.f20949h = thirdPartyPinOwnerAdapter;
        this.f20950i = linkUserWebsiteAdapter;
        this.f20951j = linkDomainAdapter;
        this.f20952k = imageMediumDetailsAdapter;
        this.f20953l = imageLargeDetailsAdapter;
    }

    public static void c(Object obj, v vVar) {
        if (obj != null) {
            vVar.invoke();
        }
    }

    @Override // uf0.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final mh i(f30 plankModel) {
        Intrinsics.checkNotNullParameter(plankModel, "plankModel");
        String o13 = plankModel.o();
        if (o13 == null) {
            o13 = "";
        }
        String str = o13;
        String z63 = plankModel.z6();
        String uid = plankModel.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return new mh("Pin", str, z63, uid, (bh) this.f20943b.k(plankModel), (jh) this.f20944c.k(plankModel), (dh) this.f20948g.k(plankModel), plankModel.w6(), (og) this.f20942a.k(plankModel), (hh) this.f20946e.k(plankModel), (fh) this.f20945d.k(plankModel), null, null, plankModel.z4(), plankModel.P3(), null, null, (ah) this.f20947f.k(plankModel), (lh) this.f20949h.k(plankModel), (yg) this.f20950i.k(plankModel), (vg) this.f20951j.k(plankModel), (rg) this.f20952k.k(plankModel), (pg) this.f20953l.k(plankModel));
    }

    @Override // uf0.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final f30 B(mh apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        e30 r33 = f30.r3();
        c(apolloModel.f132831b, new v(r33, apolloModel, 2));
        c(apolloModel.f132832c, new v(r33, apolloModel, 3));
        c(apolloModel.f132833d, new v(r33, apolloModel, 4));
        v7 v7Var = (v7) this.f20943b.O(apolloModel);
        if (v7Var != null) {
            r33.C1(v7Var);
        }
        dl0 dl0Var = (dl0) this.f20944c.O(apolloModel);
        if (dl0Var != null) {
            r33.m2(dl0Var);
        }
        wy0 wy0Var = (wy0) this.f20948g.O(apolloModel);
        if (wy0Var != null) {
            r33.E1(wy0Var);
        }
        c(apolloModel.f132837h, new v(r33, apolloModel, 5));
        gn gnVar = (gn) this.f20942a.O(apolloModel);
        if (gnVar != null) {
            r33.U(gnVar);
        }
        se0 se0Var = (se0) this.f20946e.O(apolloModel);
        int i13 = 1;
        if (se0Var != null) {
            r33.f37153u2 = se0Var;
            boolean[] zArr = r33.f37101h3;
            if (zArr.length > 176) {
                zArr[176] = true;
            }
        }
        oe0 oe0Var = (oe0) this.f20945d.O(apolloModel);
        if (oe0Var != null) {
            r33.W1(oe0Var);
        }
        c(apolloModel.f132843n, new v(r33, apolloModel, 0));
        c(apolloModel.f132844o, new v(r33, apolloModel, i13));
        wy0 wy0Var2 = (wy0) this.f20947f.O(apolloModel);
        if (wy0Var2 != null) {
            r33.u1(wy0Var2);
        }
        wy0 wy0Var3 = (wy0) this.f20949h.O(apolloModel);
        if (wy0Var3 != null) {
            r33.p2(wy0Var3);
        }
        pz0 pz0Var = (pz0) this.f20950i.O(apolloModel);
        if (pz0Var != null) {
            r33.p1(pz0Var);
        }
        uf0.b bVar = this.f20951j;
        com.pinterest.api.model.hh hhVar = (com.pinterest.api.model.hh) bVar.O(apolloModel);
        if (hhVar != null) {
            r33.o1(hhVar);
        }
        com.pinterest.api.model.hh hhVar2 = (com.pinterest.api.model.hh) bVar.O(apolloModel);
        if (hhVar2 != null) {
            r33.o1(hhVar2);
        }
        Map map = (Map) this.f20952k.O(apolloModel);
        if (map != null) {
            r33.j0(map);
        }
        Map map2 = (Map) this.f20953l.O(apolloModel);
        if (map2 != null) {
            r33.j0(map2);
        }
        f30 a13 = r33.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }
}
