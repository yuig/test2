package ld2;

import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.t;
import kotlin.text.z;
import org.chromium.net.y;
import pd2.n;
import pd2.q0;
import r72.q;

/* loaded from: classes4.dex */
public final class i implements b {
    public final g01.a a(f type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (h.f83000e[type.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        return new g01.a(new od2.a("itemHighlight", "fn {{name}}(data: FragmentEffectInput) -> vec4f {\n    let selected_id = {{settings.selectedItemID}};\n    if (selected_id < 0) {\n        return data.color;\n    }\n\n    var color = data.color;\n    if (data.item_id != selected_id) {\n        color = vec4f(color.rgb * (1.0 - {{settings.bgShadow}}), color.a);\n    }\n\n    return color;\n}", new q0(z0.g(new Pair("selectedItemID", new n(-1, null)), new Pair("bgShadow", jq.b.n(0.5f, null, 0.0f, 1.0f))))));
    }

    @Override // ld2.b
    public final od2.c h(g type) {
        Intrinsics.checkNotNullParameter(type, "type");
        int i13 = h.f82998c[type.ordinal()];
        if (i13 == 1) {
            return y.L("echo");
        }
        if (i13 == 2) {
            return y.L("carousel");
        }
        if (i13 == 3) {
            return y.L("glitch");
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ld2.b
    public final nd2.b t(e type) {
        Intrinsics.checkNotNullParameter(type, "type");
        switch (h.f82999d[type.ordinal()]) {
            case 1:
                return y.K("borderOld");
            case 2:
                return y.K("shadowOld");
            case 3:
                return y.K("border");
            case 4:
                return y.K("shadow");
            case 5:
                return y.K("tornPaper");
            case 6:
                return y.K("stamp");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // ld2.b
    public final nd2.b v(od2.a effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        return new nd2.b(effect.f94185a, e0.b(CollectionsKt.Z(f0.j(z.n(effect.f94186b, "{{name}}", "{{name}}_impl_colorFilter"), "", t.b("\n        fn {{name}}(\n            data: FilterInput,\n            t_orig: texture_2d<f32>,\n            s_orig: sampler,\n            t_prev: texture_2d<f32>,\n            s_prev: sampler\n        ) -> vec4f {\n            var effectData: FragmentEffectInput;\n            effectData.color = textureSample(t_orig, s_orig, data.uv);\n            effectData.position = vec3f(2.0 * (data.uv - vec2f(0.5)), 1.0);\n            effectData.clip_position = effectData.position;\n            effectData.uv = data.uv;\n            effectData.size = vec2f(textureDimensions(t_orig));\n            effectData.time = 0.0;\n            effectData.item_id = 0;\n\n            return {{name}}_impl_colorFilter(effectData);\n        }\n        ")), "\n", null, null, 0, null, null, 62)), "", effect.f94189e, effect.f94187c);
    }

    @Override // ld2.b
    public final od2.a y(c type) {
        Intrinsics.checkNotNullParameter(type, "type");
        switch (h.f82996a[type.ordinal()]) {
            case 1:
                return y.I("alphaGradient");
            case 2:
                return y.I("opacity");
            case 3:
                return y.I("transparentShadows");
            case 4:
                return y.I("transparentHighlights");
            case 5:
                return y.I(q.FADE_ALIAS);
            case 6:
                return y.I("chrome");
            case 7:
                return y.I("instant");
            case 8:
                return y.I("invert");
            case 9:
                return y.I("linear");
            case 10:
                return y.I("mono");
            case 11:
                return y.I("noir");
            case 12:
                return y.I("process");
            case 13:
                return y.I("sepia");
            case 14:
                return y.I("tonal");
            case 15:
                return y.I("tone");
            case 16:
                return y.I("transfer");
            case 17:
                return y.I("washed");
            case 18:
                Pair[] pairs = {new Pair("color", new pd2.f(new id2.c())), new Pair("opacity", jq.b.n(0.5f, null, 0.0f, 1.0f))};
                Intrinsics.checkNotNullParameter(pairs, "pairs");
                Intrinsics.checkNotNullParameter(pairs, "<this>");
                LinkedHashMap linkedHashMap = new LinkedHashMap(y0.a(2));
                z0.q(linkedHashMap, pairs);
                return new od2.a("colorize", "fn {{name}}(data: FragmentEffectInput) -> vec4f {\n    let origColor = data.color;\n    let newColor = {{settings.color}};\n\n    let mixed = mix(origColor.rgb, newColor.rgb, {{settings.opacity}} * origColor.a);\n    return vec4f(mixed, origColor.a);\n}", new q0(linkedHashMap));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // ld2.b
    public final od2.b z(d type) {
        Intrinsics.checkNotNullParameter(type, "type");
        switch (h.f82997b[type.ordinal()]) {
            case 1:
                return y.J("swivel");
            case 2:
                return y.J("pulse");
            case 3:
                return y.J("shaky");
            case 4:
                return y.J("wobbly");
            case 5:
                return y.J("floaty");
            case 6:
                return y.J("watery");
            case 7:
                return y.J("lavaLamp");
            case 8:
                return y.J("rotation");
            case 9:
                return y.J("slide");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
