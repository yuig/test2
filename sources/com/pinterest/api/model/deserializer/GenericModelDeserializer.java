package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.gb;
import com.pinterest.deserializers.ModelDeserializerWithSave;
import com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge;
import d12.i;
import dl1.s;
import dl1.x;
import k10.b;
import ke0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vd0.c;

@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BÃ\u0003\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0001\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0001\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0001\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0001\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0001\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0001\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0001\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0001\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u0001\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u0001\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0001\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0001\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u0001\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u0001\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u0001\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u0002010\u0001\u0012\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u0001\u0012\f\u00106\u001a\b\u0012\u0004\u0012\u0002050\u0001\u0012\f\u00108\u001a\b\u0012\u0004\u0012\u0002070\u0001\u0012\f\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u0001\u0012\f\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u0001\u0012\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u0001\u0012\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u0001\u0012\f\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\u0001\u0012\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lcom/pinterest/api/model/deserializer/GenericModelDeserializer;", "Lke0/a;", "Ldl1/s;", "Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;", "Lcom/pinterest/api/model/wy0;", "userDeserializer", "Lcom/pinterest/api/model/f30;", "pinDeserializer", "Lcom/pinterest/api/model/v7;", "boardDeserializer", "Lcom/pinterest/api/model/zs;", "interestDeserializer", "Lcom/pinterest/api/model/vh;", "dynamicStoryDeserializer", "Lcom/pinterest/api/model/qe;", "contextualSearchObjectDeserializer", "Lcom/pinterest/deserializers/ModelDeserializerWithSave;", "Lcom/pinterest/api/model/xk;", "exploreArticleDeserializer", "Lcom/pinterest/api/model/gb;", "bubbleSeparatorDeserializer", "Lcom/pinterest/api/model/Taxonomy;", "taxonomyDeserializer", "Lcom/pinterest/api/model/yk;", "exploreSearchObjectDeserializer", "Lcom/pinterest/api/model/bx0;", "trendingHashTagDeserializer", "Lcom/pinterest/api/model/az0;", "userDidItDeserializer", "Lcom/pinterest/api/model/ga;", "boardSectionNameRecommendationDeserializer", "Lcom/pinterest/api/model/ba;", "boardSectionDeserializer", "Lcom/pinterest/api/model/hr;", "ideasCardDeserializer", "Lcom/pinterest/api/model/x80;", "productGroupDeserializer", "Lcom/pinterest/api/model/qy0;", "usecaseDeserializer", "Lcom/pinterest/api/model/zv0;", "todayArticleDeserializer", "Lcom/pinterest/api/model/zq;", "ideaPinStickerDeserializer", "Lcom/pinterest/api/model/dr;", "ideaPinStickerCategoryDeserializer", "Lcom/pinterest/api/model/pp;", "ideaPinInteractiveStickerDeserializer", "Lcom/pinterest/api/model/eq;", "ideaPinMusicMetadataDeserializer", "Lcom/pinterest/api/model/iq;", "ideaPinMusicTagDeserializer", "Lcom/pinterest/api/model/yp;", "ideaPinMusicArtistDeserializer", "Lcom/pinterest/api/model/u8;", "boardMoreIdeasFeedUpsellDeserializer", "Lcom/pinterest/api/model/q30;", "pinClusterDeserializer", "Lcom/pinterest/api/model/h20;", "pearInsightDeserializer", "Lcom/pinterest/api/model/tc0;", "relatedFilterTabDeserializer", "Lcom/pinterest/api/model/lx0;", "unifiedCommentsPreviewDeserializer", "Lcom/pinterest/api/model/g00;", "onebarmoduleDeserializer", "Lcom/pinterest/api/model/fi0;", "shuffleDeserializer", "Ld12/i;", "repositoryBatcher", "<init>", "(Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;Lke0/a;Lcom/pinterest/deserializers/ModelDeserializerWithSave;Lke0/a;Lke0/a;Lke0/a;Lke0/a;Lke0/a;Lke0/a;Lke0/a;Lke0/a;Lke0/a;Lke0/a;Lke0/a;Lke0/a;Lke0/a;Lke0/a;Lke0/a;Lke0/a;Lke0/a;Lke0/a;Lke0/a;Lke0/a;Lke0/a;Lke0/a;Lke0/a;Lke0/a;Ld12/i;)V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class GenericModelDeserializer extends a {
    public final a A;
    public final a B;
    public final a C;
    public final a D;
    public final a E;
    public final a F;
    public final i G;

    /* renamed from: b, reason: collision with root package name */
    public final ModelDeserializerWithSaveAndMerge f36775b;

    /* renamed from: c, reason: collision with root package name */
    public final ModelDeserializerWithSaveAndMerge f36776c;

    /* renamed from: d, reason: collision with root package name */
    public final ModelDeserializerWithSaveAndMerge f36777d;

    /* renamed from: e, reason: collision with root package name */
    public final ModelDeserializerWithSaveAndMerge f36778e;

    /* renamed from: f, reason: collision with root package name */
    public final ModelDeserializerWithSaveAndMerge f36779f;

    /* renamed from: g, reason: collision with root package name */
    public final a f36780g;

    /* renamed from: h, reason: collision with root package name */
    public final ModelDeserializerWithSave f36781h;

    /* renamed from: i, reason: collision with root package name */
    public final a f36782i;

    /* renamed from: j, reason: collision with root package name */
    public final a f36783j;

    /* renamed from: k, reason: collision with root package name */
    public final a f36784k;

    /* renamed from: l, reason: collision with root package name */
    public final a f36785l;

    /* renamed from: m, reason: collision with root package name */
    public final a f36786m;

    /* renamed from: n, reason: collision with root package name */
    public final a f36787n;

    /* renamed from: o, reason: collision with root package name */
    public final a f36788o;

    /* renamed from: p, reason: collision with root package name */
    public final a f36789p;

    /* renamed from: q, reason: collision with root package name */
    public final a f36790q;

    /* renamed from: r, reason: collision with root package name */
    public final a f36791r;

    /* renamed from: s, reason: collision with root package name */
    public final a f36792s;

    /* renamed from: t, reason: collision with root package name */
    public final a f36793t;

    /* renamed from: u, reason: collision with root package name */
    public final a f36794u;

    /* renamed from: v, reason: collision with root package name */
    public final a f36795v;

    /* renamed from: w, reason: collision with root package name */
    public final a f36796w;

    /* renamed from: x, reason: collision with root package name */
    public final a f36797x;

    /* renamed from: y, reason: collision with root package name */
    public final a f36798y;

    /* renamed from: z, reason: collision with root package name */
    public final a f36799z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GenericModelDeserializer(@org.jetbrains.annotations.NotNull com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge<com.pinterest.api.model.wy0> r17, @org.jetbrains.annotations.NotNull com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge<com.pinterest.api.model.f30> r18, @org.jetbrains.annotations.NotNull com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge<com.pinterest.api.model.v7> r19, @org.jetbrains.annotations.NotNull com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge<com.pinterest.api.model.zs> r20, @org.jetbrains.annotations.NotNull com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge<com.pinterest.api.model.vh> r21, @org.jetbrains.annotations.NotNull ke0.a r22, @org.jetbrains.annotations.NotNull com.pinterest.deserializers.ModelDeserializerWithSave<com.pinterest.api.model.xk> r23, @org.jetbrains.annotations.NotNull ke0.a r24, @org.jetbrains.annotations.NotNull ke0.a r25, @org.jetbrains.annotations.NotNull ke0.a r26, @org.jetbrains.annotations.NotNull ke0.a r27, @org.jetbrains.annotations.NotNull ke0.a r28, @org.jetbrains.annotations.NotNull ke0.a r29, @org.jetbrains.annotations.NotNull ke0.a r30, @org.jetbrains.annotations.NotNull ke0.a r31, @org.jetbrains.annotations.NotNull ke0.a r32, @org.jetbrains.annotations.NotNull ke0.a r33, @org.jetbrains.annotations.NotNull ke0.a r34, @org.jetbrains.annotations.NotNull ke0.a r35, @org.jetbrains.annotations.NotNull ke0.a r36, @org.jetbrains.annotations.NotNull ke0.a r37, @org.jetbrains.annotations.NotNull ke0.a r38, @org.jetbrains.annotations.NotNull ke0.a r39, @org.jetbrains.annotations.NotNull ke0.a r40, @org.jetbrains.annotations.NotNull ke0.a r41, @org.jetbrains.annotations.NotNull ke0.a r42, @org.jetbrains.annotations.NotNull ke0.a r43, @org.jetbrains.annotations.NotNull ke0.a r44, @org.jetbrains.annotations.NotNull ke0.a r45, @org.jetbrains.annotations.NotNull ke0.a r46, @org.jetbrains.annotations.NotNull ke0.a r47, @org.jetbrains.annotations.NotNull d12.i r48) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.api.model.deserializer.GenericModelDeserializer.<init>(com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge, com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge, com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge, com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge, com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge, ke0.a, com.pinterest.deserializers.ModelDeserializerWithSave, ke0.a, ke0.a, ke0.a, ke0.a, ke0.a, ke0.a, ke0.a, ke0.a, ke0.a, ke0.a, ke0.a, ke0.a, ke0.a, ke0.a, ke0.a, ke0.a, ke0.a, ke0.a, ke0.a, ke0.a, ke0.a, ke0.a, ke0.a, ke0.a, d12.i):void");
    }

    @Override // ke0.a
    public final s d(c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return e(json, true, true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final s e(c cVar, boolean z13, boolean z14) {
        char c13;
        if (cVar == null || !cVar.e("type")) {
            return new x(cVar);
        }
        b bVar = b.f78110a;
        String type = cVar.o("type", "");
        Intrinsics.checkNotNullExpressionValue(type, "optString(...)");
        bVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        switch (type.hashCode()) {
            case -2031132987:
                if (type.equals("pincluster")) {
                    c13 = 28;
                    break;
                }
                c13 = 65535;
                break;
            case -1811041643:
                if (type.equals("todayarticle")) {
                    c13 = 19;
                    break;
                }
                c13 = 65535;
                break;
            case -1170193657:
                if (type.equals("trendinghashtag")) {
                    c13 = '\f';
                    break;
                }
                c13 = 65535;
                break;
            case -1002058100:
                if (type.equals("board_section")) {
                    c13 = 14;
                    break;
                }
                c13 = 65535;
                break;
            case -799186755:
                if (type.equals("storypinsticker")) {
                    c13 = 21;
                    break;
                }
                c13 = 65535;
                break;
            case -627026173:
                if (type.equals("explorearticle")) {
                    c13 = 6;
                    break;
                }
                c13 = 65535;
                break;
            case -412974807:
                if (type.equals("userdiditdata")) {
                    c13 = 11;
                    break;
                }
                c13 = 65535;
                break;
            case -286945940:
                if (type.equals("ideascard")) {
                    c13 = 15;
                    break;
                }
                c13 = 65535;
                break;
            case -284290917:
                if (type.equals("storypininteractivesticker")) {
                    c13 = 23;
                    break;
                }
                c13 = 65535;
                break;
            case -262524079:
                if (type.equals("taxonomy")) {
                    c13 = '\b';
                    break;
                }
                c13 = 65535;
                break;
            case -147577545:
                if (type.equals("usecase")) {
                    c13 = 18;
                    break;
                }
                c13 = 65535;
                break;
            case -103408206:
                if (type.equals("exploreseparator")) {
                    c13 = 7;
                    break;
                }
                c13 = 65535;
                break;
            case -12059174:
                if (type.equals("board_more_ideas_feed_upsell")) {
                    c13 = 26;
                    break;
                }
                c13 = 65535;
                break;
            case 110997:
                if (type.equals("pin")) {
                    c13 = 0;
                    break;
                }
                c13 = 65535;
                break;
            case 3599307:
                if (type.equals("user")) {
                    c13 = 2;
                    break;
                }
                c13 = 65535;
                break;
            case 43877714:
                if (type.equals("relatedfiltertab")) {
                    c13 = 29;
                    break;
                }
                c13 = 65535;
                break;
            case 93166550:
                if (type.equals("audio")) {
                    c13 = 24;
                    break;
                }
                c13 = 65535;
                break;
            case 93908710:
                if (type.equals("board")) {
                    c13 = 1;
                    break;
                }
                c13 = 65535;
                break;
            case 109770997:
                if (type.equals("story")) {
                    c13 = 4;
                    break;
                }
                c13 = 65535;
                break;
            case 482534907:
                if (type.equals("exploresearch")) {
                    c13 = '\n';
                    break;
                }
                c13 = 65535;
                break;
            case 513518745:
                if (type.equals("onebarmodule")) {
                    c13 = 31;
                    break;
                }
                c13 = 65535;
                break;
            case 570402602:
                if (type.equals("interest")) {
                    c13 = 3;
                    break;
                }
                c13 = 65535;
                break;
            case 713099706:
                if (type.equals("board_section_name_recommendation")) {
                    c13 = '\r';
                    break;
                }
                c13 = 65535;
                break;
            case 841335453:
                if (type.equals("audioartist")) {
                    c13 = 27;
                    break;
                }
                c13 = 65535;
                break;
            case 859257430:
                if (type.equals("contextual_search")) {
                    c13 = 5;
                    break;
                }
                c13 = 65535;
                break;
            case 975932420:
                if (type.equals("audiotag")) {
                    c13 = 25;
                    break;
                }
                c13 = 65535;
                break;
            case 1021896432:
                if (type.equals("productgroup")) {
                    c13 = 17;
                    break;
                }
                c13 = 65535;
                break;
            case 1183191227:
                if (type.equals("storypinstickercategory")) {
                    c13 = 22;
                    break;
                }
                c13 = 65535;
                break;
            case 1734202242:
                if (type.equals("unifiedcommentspreview")) {
                    c13 = 30;
                    break;
                }
                c13 = 65535;
                break;
            case 1776622578:
                if (type.equals("pearinsight")) {
                    c13 = '!';
                    break;
                }
                c13 = 65535;
                break;
            case 2072332025:
                if (type.equals("shuffle")) {
                    c13 = ' ';
                    break;
                }
                c13 = 65535;
                break;
            default:
                c13 = 65535;
                break;
        }
        switch (c13) {
            case 0:
                return this.f36776c.e(cVar, z13, z14);
            case 1:
                return this.f36777d.e(cVar, z13, z14);
            case 2:
                return this.f36775b.e(cVar, z13, z14);
            case 3:
                return this.f36778e.e(cVar, z13, z14);
            case 4:
                return this.f36779f.e(cVar, z13, z14);
            case 5:
                return this.f36780g.d(cVar);
            case 6:
                return this.f36781h.e(cVar, z13);
            case 7:
                gb gbVar = (gb) this.f36782i.d(cVar);
                return gbVar.a() ? gbVar : new x(cVar);
            case '\b':
                return this.f36783j.d(cVar);
            case '\t':
            case 16:
            case 20:
            default:
                return new x(cVar);
            case '\n':
                return this.f36784k.d(cVar);
            case 11:
                return this.f36786m.d(cVar);
            case '\f':
                return this.f36785l.d(cVar);
            case '\r':
                return this.f36787n.d(cVar);
            case 14:
                return this.f36788o.d(cVar);
            case 15:
                return this.f36789p.d(cVar);
            case 17:
                return this.f36790q.d(cVar);
            case 18:
                return this.f36791r.d(cVar);
            case 19:
                return this.f36792s.d(cVar);
            case 21:
                return this.f36793t.d(cVar);
            case 22:
                return this.f36794u.d(cVar);
            case 23:
                return this.f36795v.d(cVar);
            case 24:
                return this.f36796w.d(cVar);
            case 25:
                return this.f36797x.d(cVar);
            case 26:
                return this.f36799z.d(cVar);
            case 27:
                return this.f36798y.d(cVar);
            case 28:
                return this.A.d(cVar);
            case 29:
                return this.C.d(cVar);
            case 30:
                return this.D.d(cVar);
            case 31:
                return this.E.d(cVar);
            case ' ':
                return this.F.d(cVar);
            case '!':
                return this.B.d(cVar);
        }
    }
}
