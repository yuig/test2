package b10;

import com.pinterest.api.model.dl0;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.gn;
import com.pinterest.api.model.hh;
import com.pinterest.api.model.oe0;
import com.pinterest.api.model.pz0;
import com.pinterest.api.model.se0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;
import x40.ag;
import x40.cg;
import x40.dg;
import x40.hf;
import x40.mf;
import x40.pf;
import x40.rf;
import x40.sf;
import x40.uf;
import x40.wf;
import x40.yf;

/* loaded from: classes.dex */
public final class b0 implements uf0.a {

    /* renamed from: a, reason: collision with root package name */
    public final uf0.b f20848a;

    /* renamed from: b, reason: collision with root package name */
    public final uf0.b f20849b;

    /* renamed from: c, reason: collision with root package name */
    public final uf0.b f20850c;

    /* renamed from: d, reason: collision with root package name */
    public final uf0.b f20851d;

    /* renamed from: e, reason: collision with root package name */
    public final uf0.b f20852e;

    /* renamed from: f, reason: collision with root package name */
    public final uf0.b f20853f;

    /* renamed from: g, reason: collision with root package name */
    public final uf0.b f20854g;

    /* renamed from: h, reason: collision with root package name */
    public final uf0.b f20855h;

    /* renamed from: i, reason: collision with root package name */
    public final uf0.b f20856i;

    /* renamed from: j, reason: collision with root package name */
    public final uf0.b f20857j;

    public b0(a10.e embedAdapter, a10.e pinnedToBoardAdapter, a10.b storyPinDataAdapter, a10.b richMetadataAdapter, a10.b richSummaryAdapter, a10.b nativeCreatorAdapter, a10.b pinnerAdapter, a10.b thirdPartyPinOwnerAdapter, a10.b linkUserWebsiteAdapter, a10.b linkDomainAdapter) {
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
        this.f20848a = embedAdapter;
        this.f20849b = pinnedToBoardAdapter;
        this.f20850c = storyPinDataAdapter;
        this.f20851d = richMetadataAdapter;
        this.f20852e = richSummaryAdapter;
        this.f20853f = nativeCreatorAdapter;
        this.f20854g = pinnerAdapter;
        this.f20855h = thirdPartyPinOwnerAdapter;
        this.f20856i = linkUserWebsiteAdapter;
        this.f20857j = linkDomainAdapter;
    }

    public static void c(Object obj, a0 a0Var) {
        if (obj != null) {
            a0Var.invoke();
        }
    }

    @Override // uf0.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dg i(f30 plankModel) {
        Intrinsics.checkNotNullParameter(plankModel, "plankModel");
        String o13 = plankModel.o();
        if (o13 == null) {
            o13 = "";
        }
        String str = o13;
        String z63 = plankModel.z6();
        String uid = plankModel.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return new dg("Pin", str, z63, uid, (sf) this.f20849b.k(plankModel), plankModel.y4(), plankModel.w6(), (ag) this.f20850c.k(plankModel), (hf) this.f20848a.k(plankModel), (wf) this.f20851d.k(plankModel), (yf) this.f20852e.k(plankModel), null, null, (rf) this.f20853f.k(plankModel), (uf) this.f20854g.k(plankModel), (cg) this.f20855h.k(plankModel), (pf) this.f20856i.k(plankModel), (mf) this.f20857j.k(plankModel), plankModel.P3(), plankModel.z4(), null);
    }

    @Override // uf0.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final f30 B(dg apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        e30 r33 = f30.r3();
        c(apolloModel.f132251b, new a0(r33, apolloModel, 2));
        c(apolloModel.f132252c, new a0(r33, apolloModel, 3));
        c(apolloModel.f132253d, new a0(r33, apolloModel, 4));
        v7 v7Var = (v7) this.f20849b.O(apolloModel);
        if (v7Var != null) {
            r33.C1(v7Var);
        }
        c(apolloModel.f132255f, new a0(r33, apolloModel, 5));
        c(apolloModel.f132256g, new a0(r33, apolloModel, 6));
        dl0 dl0Var = (dl0) this.f20850c.O(apolloModel);
        if (dl0Var != null) {
            r33.m2(dl0Var);
        }
        gn gnVar = (gn) this.f20848a.O(apolloModel);
        if (gnVar != null) {
            r33.U(gnVar);
        }
        oe0 oe0Var = (oe0) this.f20851d.O(apolloModel);
        if (oe0Var != null) {
            r33.W1(oe0Var);
        }
        se0 se0Var = (se0) this.f20852e.O(apolloModel);
        int i13 = 1;
        if (se0Var != null) {
            r33.f37153u2 = se0Var;
            boolean[] zArr = r33.f37101h3;
            if (zArr.length > 176) {
                zArr[176] = true;
            }
        }
        wy0 wy0Var = (wy0) this.f20853f.O(apolloModel);
        if (wy0Var != null) {
            r33.u1(wy0Var);
        }
        wy0 wy0Var2 = (wy0) this.f20854g.O(apolloModel);
        if (wy0Var2 != null) {
            r33.E1(wy0Var2);
        }
        wy0 wy0Var3 = (wy0) this.f20855h.O(apolloModel);
        if (wy0Var3 != null) {
            r33.p2(wy0Var3);
        }
        pz0 pz0Var = (pz0) this.f20856i.O(apolloModel);
        if (pz0Var != null) {
            r33.p1(pz0Var);
        }
        hh hhVar = (hh) this.f20857j.O(apolloModel);
        if (hhVar != null) {
            r33.o1(hhVar);
        }
        c(apolloModel.f132268s, new a0(r33, apolloModel, 0));
        c(apolloModel.f132269t, new a0(r33, apolloModel, i13));
        f30 a13 = r33.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }
}
