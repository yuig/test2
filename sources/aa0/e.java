package aa0;

import h62.m;
import h62.p;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import r72.k2;
import r72.m2;
import r72.n2;
import r72.p2;
import r72.q2;
import r72.s2;
import r72.v2;
import r72.w2;
import r72.x2;

/* loaded from: classes5.dex */
public final class e extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f1623j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f1624k = new e(1);

    /* renamed from: l, reason: collision with root package name */
    public static final e f1625l = new e(2);

    /* renamed from: m, reason: collision with root package name */
    public static final e f1626m = new e(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1627i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(0);
        this.f1627i = i13;
    }

    public final List b() {
        switch (this.f1627i) {
            case 0:
                return f0.j(new k62.f("Slant", e0.b(new k62.e(k2.GraphikBoldItalic, p.font_variation_regular))), new k62.f("Broad", e0.b(new k62.e(k2.Unbounded, p.font_variation_regular))), new k62.f("Edgy", e0.b(new k62.e(k2.Chakra, p.font_variation_regular))), new k62.f("Poppy", e0.b(new k62.e(k2.Quicksand, p.font_variation_regular))), new k62.f("Publish", e0.b(new k62.e(k2.PublicoBannerBold, p.font_variation_regular))), new k62.f("Bookish", e0.b(new k62.e(k2.OldStandardTT, p.font_variation_regular))), new k62.f("Slab", e0.b(new k62.e(k2.HeptaSlab, p.font_variation_regular))), new k62.f("Writer", e0.b(new k62.e(k2.CourierPrime, p.font_variation_regular))), new k62.f("Martian", e0.b(new k62.e(k2.MartianMono, p.font_variation_regular))), new k62.f("Groove", e0.b(new k62.e(k2.MisterFirley, p.font_variation_regular))), new k62.f("Lucky", e0.b(new k62.e(k2.LuckiestGuy, p.font_variation_regular))), new k62.f("Tower", e0.b(new k62.e(k2.GraphikXCondensedBlack, p.font_variation_regular))), new k62.f("Extend", e0.b(new k62.e(k2.LexendPeta, p.font_variation_regular))), new k62.f("Pixel", e0.b(new k62.e(k2.Pixel, p.font_variation_regular))), new k62.f("Lemon", e0.b(new k62.e(k2.LemonYellowSunExtraBold, p.font_variation_regular))), new k62.f("Cursive", e0.b(new k62.e(k2.Meddon, p.font_variation_regular))), new k62.f("Marker", e0.b(new k62.e(k2.Janitor, p.font_variation_regular))), new k62.f("Smiley", e0.b(new k62.e(k2.Grandstander, p.font_variation_regular))), new k62.f("Rocker", e0.b(new k62.e(k2.NewRocker, p.font_variation_regular))));
            case 1:
                return f0.j(new k62.g(q2.f106629b, p.effect_layer_save, sm1.b.ic_saved_gestalt, false), new k62.g(p2.f106619b, p.effect_layer_replace, sm1.b.ic_replace_gestalt, false), new k62.g(n2.f106582b, p.effect_layer_duplicate, m.ic_effects_duplicate_24dp, false), new k62.g(m2.f106577b, p.effect_layer_delete, m.ic_effects_delete_24dp, false));
            case 2:
                return e0.b(new k62.g(s2.f106650b, p.effect_shape_select, m.ic_effects_select_24dp, false));
            default:
                return f0.j(new k62.g(w2.f106701b, p.effect_text_align_left, m.ic_effects_text_align_left_24dp, false), new k62.g(v2.f106699b, p.effect_text_align_center, m.ic_effects_text_align_center_24dp, false), new k62.g(x2.f106708b, p.effect_text_align_right, m.ic_effects_text_align_right_24dp, false));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f1627i) {
        }
        return b();
    }
}
