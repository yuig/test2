package v10;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.gb;
import com.pinterest.api.model.n8;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final w10.a f123829a;

    /* renamed from: b, reason: collision with root package name */
    public final se2.a f123830b;

    /* renamed from: c, reason: collision with root package name */
    public final ModelDeserializerWithSaveAndMerge f123831c;

    /* renamed from: d, reason: collision with root package name */
    public final ModelDeserializerWithSaveAndMerge f123832d;

    /* renamed from: e, reason: collision with root package name */
    public final ModelDeserializerWithSaveAndMerge f123833e;

    /* renamed from: f, reason: collision with root package name */
    public final ke0.a f123834f;

    /* renamed from: g, reason: collision with root package name */
    public final ke0.a f123835g;

    /* renamed from: h, reason: collision with root package name */
    public final ke0.a f123836h;

    /* renamed from: i, reason: collision with root package name */
    public final ke0.a f123837i;

    /* renamed from: j, reason: collision with root package name */
    public final ke0.a f123838j;

    /* renamed from: k, reason: collision with root package name */
    public final d f123839k;

    public a(@NotNull w10.a cardsCarouselExtraction, @NotNull se2.a lazyUserDeserializer, @NotNull ModelDeserializerWithSaveAndMerge<vh> dynamicStoryDeserializer, @NotNull ModelDeserializerWithSaveAndMerge<f30> pinDeserializer, @NotNull ModelDeserializerWithSaveAndMerge<v7> boardDeserializer, @NotNull ke0.a bubbleSeparatorDeserializer, @NotNull ke0.a homeFeedTabsDeserializer, @NotNull ke0.a productGroupDeserializer, @NotNull ke0.a boardNoteDeserializer, @NotNull ke0.a todayArticleDeserializer, @NotNull d modelSync) {
        Intrinsics.checkNotNullParameter(cardsCarouselExtraction, "cardsCarouselExtraction");
        Intrinsics.checkNotNullParameter(lazyUserDeserializer, "lazyUserDeserializer");
        Intrinsics.checkNotNullParameter(dynamicStoryDeserializer, "dynamicStoryDeserializer");
        Intrinsics.checkNotNullParameter(pinDeserializer, "pinDeserializer");
        Intrinsics.checkNotNullParameter(boardDeserializer, "boardDeserializer");
        Intrinsics.checkNotNullParameter(bubbleSeparatorDeserializer, "bubbleSeparatorDeserializer");
        Intrinsics.checkNotNullParameter(homeFeedTabsDeserializer, "homeFeedTabsDeserializer");
        Intrinsics.checkNotNullParameter(productGroupDeserializer, "productGroupDeserializer");
        Intrinsics.checkNotNullParameter(boardNoteDeserializer, "boardNoteDeserializer");
        Intrinsics.checkNotNullParameter(todayArticleDeserializer, "todayArticleDeserializer");
        Intrinsics.checkNotNullParameter(modelSync, "modelSync");
        this.f123829a = cardsCarouselExtraction;
        this.f123830b = lazyUserDeserializer;
        this.f123831c = dynamicStoryDeserializer;
        this.f123832d = pinDeserializer;
        this.f123833e = boardDeserializer;
        this.f123834f = bubbleSeparatorDeserializer;
        this.f123835g = homeFeedTabsDeserializer;
        this.f123836h = productGroupDeserializer;
        this.f123837i = boardNoteDeserializer;
        this.f123838j = todayArticleDeserializer;
        this.f123839k = modelSync;
    }

    public static boolean d(String str) {
        return z.i("board", str, true);
    }

    public static boolean e(String str) {
        return z.i("board_more_ideas_cards_carousel", str, true);
    }

    public static boolean f(String str) {
        return z.i("boardnote", str, true);
    }

    public static boolean g(String str) {
        return z.i("exploreseparator", str, true);
    }

    public static boolean h(String str) {
        return z.i("home_feed_tabs", str, true);
    }

    public static boolean i(String str) {
        return z.i("productgroup", str, true);
    }

    public static boolean j(String str) {
        return z.i("todayarticle", str, true);
    }

    public static boolean k(String str) {
        return z.i("user", str, true);
    }

    public final v7 a(vd0.c cVar) {
        v7 v7Var = (v7) this.f123833e.e(cVar, false, false);
        Intrinsics.checkNotNullExpressionValue(v7Var.getId(), "getUid(...)");
        if ((!z.j(r0)) && v7Var.k1() != null) {
            wy0 k13 = v7Var.k1();
            Intrinsics.f(k13);
            Intrinsics.checkNotNullExpressionValue(k13.getId(), "getUid(...)");
            if (!z.j(r0)) {
                n8 n8Var = n8.f40341a;
                String id3 = v7Var.getId();
                Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
                wy0 k14 = v7Var.k1();
                Intrinsics.f(k14);
                String id4 = k14.getId();
                Intrinsics.checkNotNullExpressionValue(id4, "getUid(...)");
                n8Var.getClass();
                n8.b(id3, id4);
            }
        }
        return v7Var;
    }

    public final gb b(vd0.c cVar) {
        gb gbVar = (gb) this.f123834f.d(cVar);
        Intrinsics.f(gbVar);
        if (gbVar.a()) {
            return gbVar;
        }
        return null;
    }

    public final wy0 c(vd0.c cVar) {
        return (wy0) ((ModelDeserializerWithSaveAndMerge) ((bf2.b) this.f123830b).get()).e(cVar, false, false);
    }
}
