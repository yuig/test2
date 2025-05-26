package com.pinterest.api.model.deserializer;

import android.util.Pair;
import bf2.b;
import com.google.gson.reflect.TypeToken;
import com.pinterest.api.model.gw;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.ik0;
import com.pinterest.api.model.kh;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.mi;
import com.pinterest.api.model.mn;
import com.pinterest.api.model.ni;
import com.pinterest.api.model.nn;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.ya;
import com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge;
import df.j1;
import dl1.s;
import hh0.e;
import i32.b0;
import i32.d0;
import i32.e0;
import i32.e1;
import i32.f1;
import i32.g0;
import i32.h1;
import i32.i1;
import i32.k1;
import i32.l1;
import i32.n1;
import i32.o1;
import i32.q1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kh2.g3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import lb0.q;
import lh0.a4;
import lh0.d3;
import lh0.g1;
import lh0.z3;
import nm.u;
import org.jetbrains.annotations.NotNull;
import se2.a;
import tb0.h;
import vd0.c;
import xk2.r;
import z32.k0;
import z32.m0;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/pinterest/api/model/deserializer/DynamicStoryDeserializer;", "Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;", "Lcom/pinterest/api/model/vh;", "Ltb0/h;", "crashReporting", "Lcom/pinterest/api/model/gw;", "modelHelper", "Lcom/pinterest/api/model/wy0;", "userDeserializer", "Lse2/a;", "Lcom/pinterest/api/model/deserializer/GenericModelDeserializer;", "lazyGenericModelDeserializer", "Llb0/q;", "prefsManagerPersisted", "Llh0/d3;", "repositoryExperiments", "Lk10/a;", "storyHistoryHelper", "<init>", "(Ltb0/h;Lcom/pinterest/api/model/gw;Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;Lse2/a;Llb0/q;Llh0/d3;Lk10/a;)V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class DynamicStoryDeserializer extends ModelDeserializerWithSaveAndMerge<vh> {

    /* renamed from: b, reason: collision with root package name */
    public final h f36764b;

    /* renamed from: c, reason: collision with root package name */
    public final gw f36765c;

    /* renamed from: d, reason: collision with root package name */
    public final ModelDeserializerWithSaveAndMerge f36766d;

    /* renamed from: e, reason: collision with root package name */
    public final a f36767e;

    /* renamed from: f, reason: collision with root package name */
    public final q f36768f;

    /* renamed from: g, reason: collision with root package name */
    public final d3 f36769g;

    /* renamed from: h, reason: collision with root package name */
    public final k10.a f36770h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicStoryDeserializer(@NotNull h crashReporting, @NotNull gw modelHelper, @NotNull ModelDeserializerWithSaveAndMerge<wy0> userDeserializer, @NotNull a lazyGenericModelDeserializer, @NotNull q prefsManagerPersisted, @NotNull d3 repositoryExperiments, @NotNull k10.a storyHistoryHelper) {
        super("story");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(modelHelper, "modelHelper");
        Intrinsics.checkNotNullParameter(userDeserializer, "userDeserializer");
        Intrinsics.checkNotNullParameter(lazyGenericModelDeserializer, "lazyGenericModelDeserializer");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(repositoryExperiments, "repositoryExperiments");
        Intrinsics.checkNotNullParameter(storyHistoryHelper, "storyHistoryHelper");
        Intrinsics.checkNotNullParameter("story", "jsonType");
        this.f36764b = crashReporting;
        this.f36765c = modelHelper;
        this.f36766d = userDeserializer;
        this.f36767e = lazyGenericModelDeserializer;
        this.f36768f = prefsManagerPersisted;
        this.f36769g = repositoryExperiments;
        this.f36770h = storyHistoryHelper;
    }

    @Override // ke0.a
    public final s d(c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return e(json, false, false);
    }

    @Override // com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final vh e(c json, boolean z13, boolean z14) {
        Object obj;
        String str;
        h hVar;
        c m13;
        int i13;
        List imageUrls;
        vd0.a c13;
        c m14;
        String str2;
        String str3;
        g0 g0Var;
        m0 m0Var;
        Intrinsics.checkNotNullParameter(json, "json");
        Object e13 = c.f125622b.e(json.f125623a, vh.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.DynamicStory");
        vh story = (vh) e13;
        ArrayList arrayList = new ArrayList();
        if (json.e("title")) {
            story.f42855m = kj.c(json.m("title"));
            arrayList.add("title");
        }
        if (json.e("subtitle")) {
            story.f42856n = kj.c(json.m("subtitle"));
            arrayList.add("subtitle");
        }
        if (json.e("background_colour")) {
            story.x0(json.o("background_colour", ""));
        }
        if (json.e("button_text")) {
            kj.c(json.m("button_text"));
            arrayList.add("button_text");
        }
        if (json.e("description")) {
            story.B0(kj.c(json.m("description")));
            arrayList.add("description");
        }
        if (json.e("tracking_params")) {
            story.R0(json.o("tracking_params", ""));
        }
        c m15 = json.m("user");
        ModelDeserializerWithSaveAndMerge modelDeserializerWithSaveAndMerge = this.f36766d;
        if (m15 != null) {
            story.U0((wy0) modelDeserializerWithSaveAndMerge.e(m15, z13, z14));
            arrayList.add("user");
        }
        c m16 = json.m("curator");
        if (m16 != null) {
            story.U0((wy0) modelDeserializerWithSaveAndMerge.e(m16, z13, z14));
            arrayList.add("curator");
        }
        String str4 = "type";
        if (json.e("experience")) {
            c m17 = json.m("experience");
            if (m17 != null) {
                story.C0(m17.f125623a.toString());
                Object R = g3.R(m17, m17.j(-1, "type"));
                xk2.q qVar = xk2.s.f135225b;
                if (R instanceof r) {
                    R = null;
                }
                story.D0((e) R);
                Unit unit = Unit.f80348a;
            }
            arrayList.add("experience");
        }
        if (json.e("experience_extra_context")) {
            c m18 = json.m("experience_extra_context");
            story.f42862t = m18 != null ? m18.f125623a.toString() : null;
            arrayList.add("experience_extra_context");
        }
        boolean e14 = json.e("container_type");
        h hVar2 = this.f36764b;
        if (e14) {
            int j13 = json.j(0, "container_type");
            if (j13 == 0) {
                j13 = (int) json.i("container_type", 0.0d);
            }
            if (j13 != 0) {
                m0.Companion.getClass();
                m0Var = k0.a(j13);
            } else {
                m0Var = null;
            }
            story.f42868z = m0Var;
            if (m0Var == null) {
                String uid = story.getUid();
                int j14 = json.j(-999, "container_type");
                double i14 = json.i("container_type", -999.0d);
                String o13 = json.o("container_type", "999");
                obj = "container_type";
                str = "json";
                StringBuilder v13 = a.a.v("DynamicStoryDeserializer invalid container_type value for story id:", uid, " as int:", j14, " as double:");
                v13.append(i14);
                v13.append(" as string:");
                v13.append(o13);
                hVar2.h(v13.toString());
            } else {
                obj = "container_type";
                str = "json";
            }
        } else {
            obj = "container_type";
            str = "json";
            hVar2.h("DynamicStoryDeserializer missing container_type element for story id:" + story.getUid());
        }
        String o14 = json.o("referring_source", "");
        story.A = o14;
        if (o14 != null && o14.length() != 0) {
            arrayList.add("referring_source");
        }
        c m19 = json.m("logging_aux_data");
        if (m19 != null) {
            if (m19.e("source_id")) {
                story.L0(m19.o("source_id", ""));
            }
            arrayList.add("logging_aux_data");
        }
        c m23 = json.m("action");
        if (m23 != null) {
            story.w0(ih.w(m23));
            arrayList.add("action");
        }
        c m24 = json.m("display_options");
        if (m24 != null) {
            Object e15 = c.f125622b.e(m24.f125623a, kh.class);
            Intrinsics.g(e15, "null cannot be cast to non-null type com.pinterest.api.model.DynamicDisplayOption");
            story.f42858p = (kh) e15;
            arrayList.add("display_options");
        }
        c m25 = json.m("bookmarks_for_objects");
        if (m25 != null) {
            Object e16 = c.f125622b.e(m25.f125623a, ya.class);
            Intrinsics.g(e16, "null cannot be cast to non-null type com.pinterest.api.model.BookmarksForObjects");
            story.z0((ya) e16);
            arrayList.add("bookmarks_for_objects");
        }
        ArrayList arrayList2 = new ArrayList();
        c m26 = json.m("content");
        vd0.a jsonObjects = m26 != null ? m26.k("objects") : json.c("objects");
        if (jsonObjects != null) {
            if (jsonObjects.d() > 0) {
                StringBuilder sb3 = new StringBuilder();
                GenericModelDeserializer genericModelDeserializer = (GenericModelDeserializer) ((b) this.f36767e).get();
                genericModelDeserializer.getClass();
                Intrinsics.checkNotNullParameter(jsonObjects, "jsonObjects");
                ArrayList arrayList3 = new ArrayList();
                for (Iterator it = jsonObjects.iterator(); it.hasNext(); it = it) {
                    arrayList3.add(genericModelDeserializer.e((c) it.next(), false, false));
                    hVar2 = hVar2;
                }
                hVar = hVar2;
                new j10.e(arrayList3, genericModelDeserializer).b();
                Iterator it2 = arrayList3.iterator();
                int i15 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        f0.p();
                        throw null;
                    }
                    s sVar = (s) next;
                    String o15 = jsonObjects.b(i15).o(str4, "");
                    vd0.a aVar = jsonObjects;
                    Intrinsics.checkNotNullExpressionValue(o15, "optString(...)");
                    String str5 = str4;
                    sb3.append(j1.V("%s:%s|", o15, sVar.getUid()));
                    if (o15 != null && o15.length() != 0) {
                        arrayList2.add(o15);
                    }
                    story.f42865w.add(sVar);
                    i15 = i16;
                    jsonObjects = aVar;
                    str4 = str5;
                }
                story.f42852j = sb3.toString();
            } else {
                hVar = hVar2;
            }
            Unit unit2 = Unit.f80348a;
        } else {
            hVar = hVar2;
        }
        c m27 = json.m("mapped_display_options");
        if (m27 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str6 : m27.g()) {
                c m28 = m27.m(str6);
                if (m28 != null) {
                    Intrinsics.f(str6);
                    ik0 a13 = ik0.a(m28.m("badge"));
                    Intrinsics.checkNotNullExpressionValue(a13, "from(...)");
                    linkedHashMap.put(str6, a13);
                    Unit unit3 = Unit.f80348a;
                }
            }
            story.f42863u = linkedHashMap;
            arrayList.add("mapped_display_options");
        }
        c m29 = json.m("display_options");
        if (m29 != null) {
            if (m29.e("title_text_color")) {
                if (Intrinsics.d(e1.BLACK.toString(), m29.d("title_text_color"))) {
                    story.N0(g0.DARK);
                } else {
                    story.N0(g0.LIGHT);
                }
            }
            arrayList.add("display_options");
        }
        c m33 = json.m("custom_properties");
        if (m33 != null) {
            c m34 = m33.m("video_pin");
            if (m34 != null) {
                story.W0(m34.d("url"));
                if (m33.e("video_placeholder_image")) {
                    story.V0(m33.d("video_placeholder_image"));
                    arrayList.add("video_placeholder_image");
                } else {
                    c m35 = m34.m("metadata");
                    story.V0(m35 != null ? m35.d("thumbnail") : null);
                    String w13 = story.w();
                    if (w13 != null && w13.length() != 0) {
                        arrayList.add("video_pin.metadata.thumbnail");
                    }
                }
                arrayList.add("video_pin");
            }
            c m36 = m33.m("title_text_customization");
            if (m36 != null) {
                if (m36.e("text_color")) {
                    e0 e0Var = g0.Companion;
                    int j15 = m36.j(0, "text_color");
                    e0Var.getClass();
                    story.N0(e0.a(j15));
                    arrayList.add("title_text_customization");
                } else if (m36.e("color")) {
                    String d2 = m36.d("color");
                    if (d2 != null) {
                        str3 = d2.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(str3, "toLowerCase(...)");
                    } else {
                        str3 = null;
                    }
                    if (str3 != null) {
                        int hashCode = str3.hashCode();
                        if (hashCode != -1877103645) {
                            if (hashCode != -1847520189) {
                                if (hashCode == -279597021 && str3.equals("#ffffff")) {
                                    g0Var = g0.LIGHT;
                                    story.N0(g0Var);
                                    arrayList.add("title_text_customization");
                                }
                            } else if (str3.equals("#111111")) {
                                g0Var = g0.DARK;
                                story.N0(g0Var);
                                arrayList.add("title_text_customization");
                            }
                        } else if (str3.equals("#000000")) {
                            g0Var = g0.DARK;
                            story.N0(g0Var);
                            arrayList.add("title_text_customization");
                        }
                    }
                    g0Var = null;
                    story.N0(g0Var);
                    arrayList.add("title_text_customization");
                }
                if (m36.e("horizontal_alignment")) {
                    o1 o1Var = q1.Companion;
                    int j16 = m36.j(0, "horizontal_alignment");
                    o1Var.getClass();
                    story.G0(o1.a(j16));
                    arrayList.add("horizontal_alignment");
                }
                if (m36.e("font_style")) {
                    i1 i1Var = k1.Companion;
                    int j17 = m36.j(0, "font_style");
                    i1Var.getClass();
                    story.P0(i1.a(j17));
                    arrayList.add("font_style");
                }
                if (m36.e("size")) {
                    f1 f1Var = h1.Companion;
                    int j18 = m36.j(0, "size");
                    f1Var.getClass();
                    story.O0(f1.a(j18));
                    arrayList.add("size");
                }
                if (m36.e("font_weight")) {
                    l1 l1Var = n1.Companion;
                    int j19 = m36.j(0, "font_weight");
                    l1Var.getClass();
                    story.Q0(l1.a(j19));
                    arrayList.add("font_weight");
                }
                Unit unit4 = Unit.f80348a;
            }
            if (m33.e("hide_complete_button")) {
                story.F0(m33.h("hide_complete_button", Boolean.FALSE));
                arrayList.add("hide_complete_button");
            }
            if (m33.h("hide_complete_button", Boolean.FALSE).booleanValue() || (m14 = m33.m("button_customization")) == null) {
                i13 = 0;
            } else {
                if (m14.e("button_style")) {
                    b0 b0Var = d0.Companion;
                    i13 = 0;
                    int j23 = m14.j(0, "button_style");
                    b0Var.getClass();
                    story.A0(b0.a(j23));
                    arrayList.add("button_style");
                } else {
                    i13 = 0;
                    if (m14.e("button_background_color")) {
                        String d13 = m14.d("button_background_color");
                        if (d13 != null) {
                            str2 = d13.toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
                        } else {
                            str2 = null;
                        }
                        story.A0(Intrinsics.d(str2, "#e60023") ? d0.PRIMARY : Intrinsics.d(str2, "#0074e8") ? d0.SHOPPING : null);
                    }
                }
                arrayList.add("button_customization");
            }
            if (m33.e("image_url")) {
                story.y0(m33.d("image_url"));
                arrayList.add("image_url");
            }
            if (m33.e("image")) {
                story.H0(m33.d("image"));
                arrayList.add("image");
            }
            if (m33.e("preview_image_map")) {
                c m37 = m33.m("preview_image_map");
                Object b13 = m37 != null ? m37.b(new TypeToken<Map<String, ? extends List<? extends String>>>() { // from class: com.pinterest.api.model.deserializer.DynamicStoryDeserializer$deserialize$11$4
                }.f33847b) : null;
                story.J0(b13 instanceof Map ? (Map) b13 : null);
                Map l13 = story.l();
                if (l13 != null && !l13.isEmpty()) {
                    arrayList.add("preview_image_map");
                }
            }
            if (m33.e("image_urls_list") && (c13 = m33.c("image_urls_list")) != null) {
                ArrayList arrayList4 = new ArrayList();
                int d14 = c13.d();
                while (i13 < d14) {
                    String l14 = c13.l(i13);
                    if (l14 != null) {
                        arrayList4.add(l14);
                    }
                    i13++;
                }
                story.M = arrayList4;
                List j24 = story.j();
                if (j24 != null && !j24.isEmpty()) {
                    arrayList.add("image_urls_list");
                }
                Unit unit5 = Unit.f80348a;
            }
            if (m33.e("show_attribution")) {
                story.K0(m33.h("show_attribution", Boolean.FALSE));
                arrayList.add("show_attribution");
            }
            if (m33.e("featured_creator_properties")) {
                c m38 = m33.m("featured_creator_properties");
                story.O = m38 != null ? m38.q() : null;
                Map g13 = story.g();
                if (g13 != null && !g13.isEmpty()) {
                    arrayList.add("featured_creator_properties");
                }
            }
            if (m33.e("hair_pattern_filter_list")) {
                vd0.a k13 = m33.k("hair_pattern_filter_list");
                if (k13.d() > 0) {
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it3 = k13.iterator();
                    while (it3.hasNext()) {
                        c cVar = (c) it3.next();
                        nn.f40439e.getClass();
                        nn a14 = mn.a(cVar);
                        if (a14 != null) {
                            arrayList5.add(a14);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it4 = arrayList5.iterator();
                    while (it4.hasNext()) {
                        Object next2 = it4.next();
                        nn nnVar = (nn) next2;
                        if (nnVar.getDisplay() != null && nnVar.getTerm() != null && (imageUrls = nnVar.getImageUrls()) != null && !imageUrls.isEmpty()) {
                            arrayList6.add(next2);
                        }
                    }
                    story.T = arrayList6;
                    arrayList.add("hair_pattern_filter_list");
                }
                Unit unit6 = Unit.f80348a;
            }
            Unit unit7 = Unit.f80348a;
        }
        vd0.a k14 = json.k("objects");
        if (k14.d() > 0) {
            ArrayList arrayList7 = new ArrayList();
            Iterator it5 = k14.iterator();
            while (it5.hasNext()) {
                c m39 = ((c) it5.next()).m("images");
                String o16 = (m39 == null || (m13 = m39.m("236x")) == null) ? null : m13.o("url", "");
                if (o16 != null) {
                    arrayList7.add(o16);
                }
            }
            story.M = arrayList7;
        }
        Unit unit8 = Unit.f80348a;
        c m43 = json.m("aux_fields");
        if (m43 != null && story.h() == null && m43.e("image_url")) {
            story.H0(m43.o("image_url", ""));
        }
        vd0.a k15 = json.k("item_actions");
        if (k15.d() > 0) {
            ArrayList arrayList8 = new ArrayList();
            Iterator it6 = k15.iterator();
            while (it6.hasNext()) {
                c cVar2 = (c) it6.next();
                ni.f40402c.getClass();
                ni a15 = mi.a(cVar2);
                if (a15 != null) {
                    arrayList8.add(a15);
                }
            }
            ArrayList arrayList9 = new ArrayList();
            Iterator it7 = arrayList8.iterator();
            while (it7.hasNext()) {
                Object next3 = it7.next();
                if (((ni) next3).a() != null) {
                    arrayList9.add(next3);
                }
            }
            story.I0(arrayList9);
            arrayList.add("item_actions");
        }
        Unit unit9 = Unit.f80348a;
        if (z13) {
            this.f36765c.getClass();
            gw.f(story);
        }
        u jsonObject = json.f125623a;
        Intrinsics.checkNotNullExpressionValue(jsonObject, "jsonObject");
        ((zy.b0) this.f36770h).getClass();
        q prefsManagerPersisted = this.f36768f;
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(story, "story");
        Intrinsics.checkNotNullParameter(jsonObject, str);
        d3 d3Var = this.f36769g;
        d3Var.getClass();
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) d3Var.f83331a;
        if (g1Var.o("android_dynamic_story_logging", "enabled", z3Var) || g1Var.l("android_dynamic_story_logging")) {
            ArrayList l15 = f0.l(new Pair("story_type", story.q()));
            if (story.f42868z != null) {
                l15.add(new Pair(obj, story.f42868z.toString()));
            }
            if (!arrayList.isEmpty()) {
                l15.add(new Pair("used_optional_fields", CollectionsKt.Z(CollectionsKt.w0(arrayList), ",", null, null, 0, null, null, 62)));
            }
            if (!arrayList2.isEmpty()) {
                l15.add(new Pair("used_object_types", CollectionsKt.Z(CollectionsKt.w0(arrayList2), ",", null, null, 0, null, null, 62)));
            }
            hVar.k("DynamicStoryFields", l15);
        }
        return story;
    }
}
