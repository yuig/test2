package com.pinterest.xrenderer.legacy;

import bg.d;
import bg.j;
import bg.m;
import com.pinterest.xrenderer.legacy.EffectValues;
import gg.b;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.g0;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;
import pd2.c;
import pd2.k;
import pd2.n;
import pd2.q;
import pd2.t;
import pd2.u;
import rd2.f;

/* loaded from: classes4.dex */
public abstract class a {
    public static EffectValues a(String effectName, TreeMap settings, Map resources, final String shaderTemplate) {
        String str;
        Intrinsics.checkNotNullParameter(effectName, "effectName");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(shaderTemplate, "shaderTemplate");
        ArrayList arrayList = new ArrayList(settings.size());
        for (Map.Entry entry : settings.entrySet()) {
            String str2 = (String) entry.getKey();
            u uVar = (u) entry.getValue();
            HashMap hashMap = f.f107525e;
            String d2 = d(effectName, str2);
            if (uVar instanceof c) {
                str = "bool";
            } else {
                if (!(uVar instanceof pd2.f)) {
                    if (uVar instanceof k) {
                        str = "float";
                    } else if (uVar instanceof n) {
                        str = "int";
                    } else if (uVar instanceof t) {
                        str = "vec2";
                    } else if (!(uVar instanceof q)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                str = "vec4";
            }
            arrayList.add(new EffectValues.EffectDefinitionValues.SettingValues(d2, str));
        }
        ArrayList arrayList2 = new ArrayList(resources.size());
        for (Map.Entry entry2 : resources.entrySet()) {
            String str3 = (String) entry2.getKey();
            vd2.c cVar = (vd2.c) entry2.getValue();
            HashMap hashMap2 = f.f107525e;
            arrayList2.add(new EffectValues.EffectDefinitionValues.ResourceValues(c(effectName, str3), cVar.f125643a));
        }
        EffectValues.EffectDefinitionValues effectDefinitionValues = new EffectValues.EffectDefinitionValues(arrayList, new rd2.a(0), arrayList2, new rd2.a(1));
        Set keySet = settings.keySet();
        int a13 = y0.a(g0.q(keySet, 10));
        if (a13 < 16) {
            a13 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
        for (Object obj : keySet) {
            HashMap hashMap3 = f.f107525e;
            linkedHashMap.put(obj, d(effectName, (String) obj));
        }
        Set keySet2 = resources.keySet();
        int a14 = y0.a(g0.q(keySet2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(a14 >= 16 ? a14 : 16);
        for (Object obj2 : keySet2) {
            HashMap hashMap4 = f.f107525e;
            linkedHashMap2.put(obj2, c(effectName, (String) obj2));
        }
        return new EffectValues(effectName, effectDefinitionValues, new EffectValues.ImplementationValues(linkedHashMap, linkedHashMap2, new m() { // from class: rd2.b
            @Override // java.util.function.Function
            public final Object apply(Object obj3) {
                String shaderTemplate2 = shaderTemplate;
                Intrinsics.checkNotNullParameter(shaderTemplate2, "$shaderTemplate");
                return shaderTemplate2;
            }
        }));
    }

    public static String b(Object values, String template) {
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(values, "values");
        StringReader stringReader = new StringReader(template);
        d dVar = new d();
        j jVar = (j) dVar.f22761e;
        jVar.getClass();
        cg.c a13 = jVar.a(stringReader, null, new AtomicInteger(0), "", "{{", "}}", true);
        a13.a();
        ((ThreadLocal) dVar.f22764h).remove();
        StringWriter stringWriter = new StringWriter();
        b bVar = new b();
        bVar.add(values);
        a13.b(stringWriter, bVar);
        String stringWriter2 = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    public static String c(String effectName, String resourceName) {
        Intrinsics.checkNotNullParameter(effectName, "effectName");
        Intrinsics.checkNotNullParameter(resourceName, "resourceName");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(effectName);
        return a.a.p(sb3, "_resources_", resourceName);
    }

    public static String d(String effectName, String paramName) {
        Intrinsics.checkNotNullParameter(effectName, "effectName");
        Intrinsics.checkNotNullParameter(paramName, "paramName");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(effectName);
        return a.a.p(sb3, "_settings_", paramName);
    }
}
