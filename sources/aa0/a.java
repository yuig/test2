package aa0;

import h62.m;
import h62.p;
import java.util.Map;
import k62.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import y90.z1;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1608i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f1609j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar, int i13) {
        super(1);
        this.f1608i = i13;
        this.f1609j = dVar;
    }

    public final void b(Map buildEffect) {
        d dVar = this.f1609j;
        switch (this.f1608i) {
            case 0:
                Intrinsics.checkNotNullParameter(buildEffect, "$this$buildEffect");
                buildEffect.put("opacity", d.e(dVar, p.effect_setting_opacity, m.ic_effects_opacity_24dp, null, 28));
                buildEffect.put("radius", d.e(dVar, p.effect_setting_radius, m.ic_effects_blur_24dp, null, 28));
                break;
            default:
                Intrinsics.checkNotNullParameter(buildEffect, "$this$buildEffect");
                buildEffect.put("radius", d.e(dVar, z1.collage_effect_setting_stroke, m.ic_effects_brush_24dp, null, 28));
                buildEffect.put("color", d.e(dVar, p.effect_setting_color, m.ic_effects_white_background_24dp, h.NONE, 20));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f1608i) {
            case 0:
                b((Map) obj);
                break;
            default:
                b((Map) obj);
                break;
        }
        return Unit.f80348a;
    }
}
