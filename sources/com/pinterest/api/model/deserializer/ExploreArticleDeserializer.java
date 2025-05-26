package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.ew;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.gw;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.uf;
import com.pinterest.api.model.vf;
import com.pinterest.api.model.wf;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.xf;
import com.pinterest.api.model.xk;
import com.pinterest.deserializers.ModelDeserializerWithSave;
import com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge;
import dl1.s;
import dl2.b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vd0.a;
import vd0.c;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/api/model/deserializer/ExploreArticleDeserializer;", "Lcom/pinterest/deserializers/ModelDeserializerWithSave;", "Lcom/pinterest/api/model/xk;", "Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;", "Lcom/pinterest/api/model/wy0;", "userDeserializer", "Lcom/pinterest/api/model/f30;", "pinDeserializer", "Lcom/pinterest/api/model/gw;", "modelHelper", "<init>", "(Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;Lcom/pinterest/api/model/gw;)V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ExploreArticleDeserializer extends ModelDeserializerWithSave<xk> {

    /* renamed from: b, reason: collision with root package name */
    public final ModelDeserializerWithSaveAndMerge f36771b;

    /* renamed from: c, reason: collision with root package name */
    public final ModelDeserializerWithSaveAndMerge f36772c;

    /* renamed from: d, reason: collision with root package name */
    public final gw f36773d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExploreArticleDeserializer(@NotNull ModelDeserializerWithSaveAndMerge<wy0> userDeserializer, @NotNull ModelDeserializerWithSaveAndMerge<f30> pinDeserializer, @NotNull gw modelHelper) {
        super("explorearticle");
        Intrinsics.checkNotNullParameter(userDeserializer, "userDeserializer");
        Intrinsics.checkNotNullParameter(pinDeserializer, "pinDeserializer");
        Intrinsics.checkNotNullParameter(modelHelper, "modelHelper");
        Intrinsics.checkNotNullParameter("explorearticle", "jsonType");
        this.f36771b = userDeserializer;
        this.f36772c = pinDeserializer;
        this.f36773d = modelHelper;
    }

    public static String g(a aVar, int i13, String str) {
        String d2;
        int d13 = aVar.d();
        if (d13 == 0) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        for (int i14 = 0; i14 < d13; i14++) {
            c j13 = aVar.j(i14);
            if (Intrinsics.d(str, "user") && j13.e("280x280")) {
                c m13 = j13.m("280x280");
                Intrinsics.f(m13);
                d2 = m13.d("url");
            } else if (i13 != 1) {
                if (i13 == 2) {
                    if (j13.e("474x")) {
                        c m14 = j13.m("474x");
                        Intrinsics.f(m14);
                        d2 = m14.d("url");
                    } else if (j13.e("236x")) {
                        c m15 = j13.m("236x");
                        Intrinsics.f(m15);
                        d2 = m15.d("url");
                    }
                }
                d2 = null;
            } else if (j13.e("236x")) {
                c m16 = j13.m("236x");
                Intrinsics.f(m16);
                d2 = m16.d("url");
            } else if (j13.e("136x")) {
                c m17 = j13.m("136x");
                Intrinsics.f(m17);
                d2 = m17.d("url");
            } else {
                if (j13.e("280x280")) {
                    c m18 = j13.m("280x280");
                    Intrinsics.f(m18);
                    d2 = m18.d("url");
                }
                d2 = null;
            }
            if (d2 != null) {
                sb3.append(",".concat(d2));
            }
        }
        if (sb3.length() <= 0) {
            return "";
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        String substring = sb4.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    @Override // ke0.a
    public final s d(c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return e(json, false);
    }

    @Override // com.pinterest.deserializers.ModelDeserializerWithSave
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final xk e(c json, boolean z13) {
        String str;
        Intrinsics.checkNotNullParameter(json, "json");
        Object e13 = c.f125622b.e(json.f125623a, xk.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.ExploreArticle");
        xk xkVar = (xk) e13;
        c m13 = json.m("curator");
        ModelDeserializerWithSaveAndMerge modelDeserializerWithSaveAndMerge = this.f36771b;
        if (m13 != null) {
            wy0 wy0Var = (wy0) modelDeserializerWithSaveAndMerge.e(m13, z13, z13);
            xkVar.x(wy0Var.getUid());
            Boolean O3 = wy0Var.O3();
            Intrinsics.checkNotNullExpressionValue(O3, "getIsVerifiedMerchant(...)");
            xkVar.y(O3.booleanValue());
            b.W1(wy0Var);
            xkVar.B(b.t0(wy0Var));
        }
        c m14 = json.m("video_cover_pin");
        if (m14 != null) {
            xkVar.G(((f30) this.f36772c.e(m14, z13, z13)).getUid());
        }
        c m15 = json.m("title");
        if (m15 != null) {
            xkVar.E(kj.c(m15).a());
        }
        c m16 = json.m("subtitle");
        if (m16 != null) {
            xkVar.D(kj.c(m16).a());
        }
        a k13 = json.k("cover_images");
        Intrinsics.checkNotNullExpressionValue(k13, "optJsonArray(...)");
        if (k13.d() > 0) {
            xkVar.C(g(k13, 1, xkVar.a()));
            xkVar.A(g(k13, 2, xkVar.a()));
        }
        a k14 = json.k("dominant_colors");
        int d2 = k14.d();
        if (d2 > 0) {
            StringBuilder sb3 = new StringBuilder();
            for (int i13 = 0; i13 < d2; i13++) {
                String l13 = k14.l(i13);
                if (l13 != null && l13.length() != 0) {
                    sb3.append(",");
                    sb3.append(l13);
                }
            }
            if (sb3.length() > 0) {
                String sb4 = sb3.toString();
                Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
                str = sb4.substring(1);
                Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
            } else {
                str = "";
            }
            xkVar.z(str);
        }
        a k15 = json.k("users");
        int d13 = k15.d();
        if (d13 > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i14 = 0; i14 < d13; i14++) {
                arrayList.add(modelDeserializerWithSaveAndMerge.e(k15.j(i14), z13, z13));
            }
            xkVar.F(arrayList);
        }
        c m17 = json.m("aux_fields");
        if (m17 != null) {
            xkVar.u(m17.f125623a.toString());
        }
        c m18 = json.m("flex_grid_style");
        if (m18 != null) {
            m18.i("aspect_ratio", Double.NaN);
            m18.j(0, "column_width");
        }
        c m19 = json.m("cover_pin");
        if (m19 != null) {
            m19.o("id", "");
        }
        c m23 = json.m("action");
        if (m23 != null) {
            xkVar.s(ih.w(m23));
        }
        a k16 = json.k("cover_positions");
        ArrayList arrayList2 = new ArrayList();
        int d14 = k16.d();
        for (int i15 = 0; i15 < d14; i15++) {
            c j13 = k16.j(i15);
            vf.f42836c.getClass();
            arrayList2.add(uf.a(j13));
        }
        xkVar.v(arrayList2);
        a k17 = json.k("cover_shuffle_assets");
        ArrayList arrayList3 = new ArrayList();
        int d15 = k17.d();
        for (int i16 = 0; i16 < d15; i16++) {
            wf wfVar = xf.f43662d;
            c j14 = k17.j(i16);
            Intrinsics.checkNotNullExpressionValue(j14, "optJsonObject(...)");
            wfVar.getClass();
            arrayList3.add(wf.a(j14));
        }
        xkVar.w(arrayList3);
        this.f36773d.getClass();
        ew.i(xkVar);
        return xkVar;
    }
}
