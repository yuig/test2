package com.pinterest.xrenderer.legacy.multipass_processing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import pd2.q0;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final td2.a f52876a;

    /* renamed from: b, reason: collision with root package name */
    public final int f52877b;

    /* renamed from: c, reason: collision with root package name */
    public final bn0.a f52878c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f52879d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f52880e;

    /* renamed from: f, reason: collision with root package name */
    public final d f52881f;

    public e(td2.a filter, int i13) {
        ae2.f b13;
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f52876a = filter;
        this.f52877b = i13;
        zd2.d dVar = new zd2.d(zd2.c.VERTEX_SHADER, "#version 300 es\nprecision mediump float;\n\nlayout (location = 0) in vec3 a_vertexCoord;\nlayout (location = 1) in vec2 a_textureCoord;\n\nout vec2 v_textureCoord;\n\nvoid main() {\n    v_textureCoord = vec2(a_textureCoord.x, 1.0 - a_textureCoord.y);\n    gl_Position = vec4(a_vertexCoord, 1.0);\n}");
        zd2.c cVar = zd2.c.FRAGMENT_SHADER;
        String str = (String) filter.f117473b.get(i13);
        rd2.a aVar = new rd2.a(6);
        HashMap hashMap = rd2.f.f107525e;
        q0 q0Var = filter.f117474c;
        TreeMap treeMap = q0Var.f99868a;
        String str2 = filter.f117472a;
        Map map = filter.f117475d;
        bn0.a program = new bn0.a(dVar, new zd2.d(cVar, com.pinterest.xrenderer.legacy.a.b(new FragmentShaderScope(aVar, com.pinterest.xrenderer.legacy.a.a(str2, treeMap, map, str)), "#version 300 es\n\n{{#embedCommon}}\n{{/embedCommon}}\n\nin vec2 v_textureCoord;\nuniform sampler2D s_originalTexture;\nuniform sampler2D s_sourceTexture;\n\nlayout (location = 0) out vec4 fragColor;\n\n///////////////////////////////////////////\n//// filter settings and resources\n\n{{#filterPass}}\n{{#definition}}\n{{#embedSettings}}\n{{/embedSettings}}\n\n{{#embedResources}}\n{{/embedResources}}\n{{/definition}}\n{{/filterPass}}\n\n////////////////////////////////////////////\n//// filterPass function\n\n{{#filterPass}}\n{{#implementation}}\n{{#embed}}\n{{/embed}}\n{{/implementation}}\n{{/filterPass}}\n\n////////////////////////////////////////////\n//// main\n\nvoid main() {\n    {{#filterPass}}\n    fragColor = {{name}}(v_textureCoord, s_originalTexture, s_sourceTexture);\n    {{/filterPass}}\n}")));
        this.f52878c = program;
        this.f52881f = new d(program);
        Intrinsics.checkNotNullParameter(program, "program");
        Intrinsics.checkNotNullParameter(filter, "filter");
        program.a();
        Set<String> a13 = q0Var.a();
        ArrayList arrayList = new ArrayList(g0.q(a13, 10));
        for (String str3 : a13) {
            HashMap hashMap2 = rd2.f.f107525e;
            arrayList.add(new c(program.m(com.pinterest.xrenderer.legacy.a.d(str2, str3)), str3));
        }
        this.f52879d = arrayList;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            vd2.c cVar2 = (vd2.c) entry.getValue();
            HashMap hashMap3 = rd2.f.f107525e;
            String c13 = com.pinterest.xrenderer.legacy.a.c(str2, str4);
            if (cVar2 instanceof vd2.b) {
                b13 = ((vd2.b) cVar2).b();
            } else {
                if (!(cVar2 instanceof vd2.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                b13 = ((vd2.a) cVar2).b();
            }
            arrayList2.add(new f(b13, program.m(c13)));
        }
        this.f52880e = arrayList2;
    }
}
