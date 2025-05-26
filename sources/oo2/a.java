package oo2;

import a.cb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f96862a;

    /* renamed from: b, reason: collision with root package name */
    public List f96863b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f96864c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f96865d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f96866e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f96867f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f96868g;

    public a(String serialName) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f96862a = serialName;
        this.f96863b = q0.f80391a;
        this.f96864c = new ArrayList();
        this.f96865d = new HashSet();
        this.f96866e = new ArrayList();
        this.f96867f = new ArrayList();
        this.f96868g = new ArrayList();
    }

    public static void a(a aVar, String elementName, g descriptor) {
        q0 annotations = q0.f80391a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (!aVar.f96865d.add(elementName)) {
            StringBuilder o13 = cb.o("Element with name '", elementName, "' is already registered in ");
            o13.append(aVar.f96862a);
            throw new IllegalArgumentException(o13.toString().toString());
        }
        aVar.f96864c.add(elementName);
        aVar.f96866e.add(descriptor);
        aVar.f96867f.add(annotations);
        aVar.f96868g.add(false);
    }
}
