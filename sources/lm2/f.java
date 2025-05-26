package lm2;

import am2.c1;
import am2.m;
import e82.l;
import gm2.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import mm2.k0;
import pm2.q;

/* loaded from: classes2.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    public final rg.a f83963a;

    /* renamed from: b, reason: collision with root package name */
    public final m f83964b;

    /* renamed from: c, reason: collision with root package name */
    public final int f83965c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f83966d;

    /* renamed from: e, reason: collision with root package name */
    public final on2.m f83967e;

    public f(rg.a c13, m containingDeclaration, q typeParameterOwner, int i13) {
        Intrinsics.checkNotNullParameter(c13, "c");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(typeParameterOwner, "typeParameterOwner");
        this.f83963a = c13;
        this.f83964b = containingDeclaration;
        this.f83965c = i13;
        ArrayList typeParameters = typeParameterOwner.getTypeParameters();
        Intrinsics.checkNotNullParameter(typeParameters, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i14));
            i14++;
        }
        this.f83966d = linkedHashMap;
        this.f83967e = ((on2.q) this.f83963a.c()).e(new l(this, 17));
    }

    @Override // lm2.h
    public final c1 a(e0 javaTypeParameter) {
        Intrinsics.checkNotNullParameter(javaTypeParameter, "javaTypeParameter");
        k0 k0Var = (k0) this.f83967e.invoke(javaTypeParameter);
        return k0Var != null ? k0Var : ((h) this.f83963a.f107930b).a(javaTypeParameter);
    }
}
