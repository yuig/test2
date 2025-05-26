package aa0;

import g72.b4;
import g72.g3;
import g72.h4;
import g72.i0;
import g72.j1;
import g72.j3;
import g72.k2;
import g72.k4;
import g72.n1;
import g72.q4;
import g72.s1;
import g72.s2;
import g72.s3;
import g72.t4;
import g72.v2;
import g72.v3;
import g72.y2;
import g72.y3;
import h62.p;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import lh0.a4;
import lh0.g1;
import lh0.h0;
import lh0.z3;
import r72.q;
import y90.z1;

/* loaded from: classes5.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1610i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f1611j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, int i13) {
        super(0);
        this.f1610i = i13;
        this.f1611j = dVar;
    }

    public final List b() {
        int i13 = this.f1610i;
        d dVar = this.f1611j;
        switch (i13) {
            case 0:
                return f0.j(dVar.a(n1.INSTANCE, p.effect_border_none, "none", c.f1613k), dVar.a(new s1(null, null, null), p.effect_border_shadow, "dropShadow", new a(dVar, 0)), dVar.a(new j1(null, null), p.effect_border_outline, "border", new a(dVar, 1)));
            case 1:
                i0.Companion.getClass();
                k62.a b13 = d.b(dVar, i0.f64005l, p.effect_filter_none, "none");
                q qVar = q.MONO;
                List j13 = f0.j(b13, d.b(dVar, new i0(qVar.getType()), z1.collage_effect_color_mono, "mono"), d.b(dVar, new i0(q.CHROME.getType()), z1.collage_effect_color_vibrant, "chrome"), d.b(dVar, new i0(q.INSTANT.getType()), z1.collage_effect_color_retro, "instant"), d.b(dVar, new i0(q.FADE.getType()), z1.collage_effect_color_dramatic, q.FADE_ALIAS));
                h0 h0Var = dVar.f1618c;
                h0Var.getClass();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) h0Var.f83377a;
                return CollectionsKt.l0((g1Var.o("android_collage_all_effects", "enabled", z3Var) || g1Var.l("android_collage_all_effects")) ? f0.j(d.b(dVar, new i0(q.INVERT.getType()), p.effect_filter_invert, "invert"), d.b(dVar, new i0(qVar.getType()), p.effect_filter_mono, "mono"), d.b(dVar, new i0(q.NOIR.getType()), p.effect_filter_noir, "noir"), d.b(dVar, new i0(q.PROCESS.getType()), p.effect_filter_process, "process"), d.b(dVar, new i0(q.TONAL.getType()), p.effect_filter_tonal, "tonal"), d.b(dVar, new i0(q.TRANSFER.getType()), p.effect_filter_transfer, "transfer"), d.b(dVar, new i0(q.TONE.getType()), p.effect_filter_tone, "tone"), d.b(dVar, new i0(q.LINEAR.getType()), p.effect_filter_linear, "linear"), d.b(dVar, new i0(q.SEPIA.getType()), p.effect_filter_sepia, "sepia")) : q0.f80391a, j13);
            default:
                List j14 = f0.j(d.c(dVar, g3.INSTANCE, p.effect_motion_none, "none"), d.c(dVar, new t4(null, null, null), z1.collage_effect_motion_pivot, "wobbly"), d.c(dVar, new h4(null), z1.collage_effect_motion_wave, "spinny"), d.c(dVar, new b4(null, null), z1.collage_effect_motion_slide, "leftRight"));
                h0 h0Var2 = dVar.f1618c;
                h0Var2.getClass();
                z3 z3Var2 = a4.f83298b;
                g1 g1Var2 = (g1) h0Var2.f83377a;
                return CollectionsKt.l0((g1Var2.o("android_collage_all_effects", "enabled", z3Var2) || g1Var2.l("android_collage_all_effects")) ? f0.j(d.c(dVar, new q4(null), p.effect_motion_watery, "watery"), d.c(dVar, new y2(null), p.effect_motion_floaty, "floaty"), d.c(dVar, new v3(null), p.effect_motion_shaky, "shaky"), d.c(dVar, new y3(null, null, null, null, null, null), p.effect_motion_glitch, "simpleGlitch"), d.c(dVar, new s3(null), p.effect_motion_scaly, "scaly"), d.c(dVar, new k4(null), p.effect_motion_swivel, "swivel"), d.c(dVar, new k2(null, null, null, null, null, null, null), p.effect_motion_carousel, "slide"), d.c(dVar, new j3(null, null), p.effect_motion_rotate, "rotate"), d.c(dVar, new v2(null), p.effect_motion_fade, q.FADE_ALIAS), d.c(dVar, new s2(null, null, null, null, null), p.effect_motion_echo, "echo")) : q0.f80391a, j14);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f1610i) {
        }
        return b();
    }
}
