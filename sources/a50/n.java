package a50;

import c50.r1;
import c50.v1;
import java.util.List;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.m0;

/* loaded from: classes5.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final List f760a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f761b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f762c;

    static {
        a10.e eVar = r1.f26261a;
        pc.r s13 = ep.b.s(eVar, "__typename", "name", "type");
        q0 q0Var = q0.f80391a;
        pc.m mVar = new pc.m("__typename", s13, null, q0Var, q0Var, q0Var);
        List q13 = ep.b.q("ImageDetails", "ImageDetails", "typeCondition", "possibleTypes");
        List selections = j.f742a;
        Intrinsics.checkNotNullParameter(selections, "selections");
        List selections2 = f0.j(mVar, new pc.n("ImageDetails", q13, q0Var, selections));
        f760a = selections2;
        pc.m mVar2 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q14 = ep.b.q("ImageDetails", "ImageDetails", "typeCondition", "possibleTypes");
        Intrinsics.checkNotNullParameter(selections, "selections");
        List selections3 = f0.j(mVar2, new pc.n("ImageDetails", q14, q0Var, selections));
        f761b = selections3;
        a10.e eVar2 = v1.f26394a;
        m0 v13 = ep.b.v(eVar2, "images", "name", "type");
        List r13 = ep.b.r("spec", ep.b.t("imageMediumSizeSpec", "spec", "name"), false, "arguments");
        Intrinsics.checkNotNullParameter(selections2, "selections");
        pc.m mVar3 = new pc.m("images", v13, "imageMediumDetails", q0Var, r13, selections2);
        m0 v14 = ep.b.v(eVar2, "images", "name", "type");
        List r14 = ep.b.r("spec", ep.b.t("imageLargeSizeSpec", "spec", "name"), false, "arguments");
        Intrinsics.checkNotNullParameter(selections3, "selections");
        f762c = f0.j(mVar3, new pc.m("images", v14, "imageLargeDetails", q0Var, r14, selections3));
    }
}
