package com.pinterest.xrenderer.legacy.multipass_processing;

import ae2.g;
import ae2.h;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kd2.i;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.ranges.IntRange;
import ql2.k;
import yd2.j;

/* loaded from: classes4.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f52867i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.media.a f52868j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ae2.d f52869k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ae2.d f52870l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(android.support.v4.media.a aVar, ae2.d dVar, ae2.d dVar2, int i13) {
        super(0);
        this.f52867i = i13;
        this.f52868j = aVar;
        this.f52869k = dVar;
        this.f52870l = dVar2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f52867i) {
            case 0:
                m123invoke();
                break;
            case 1:
                m123invoke();
                break;
            default:
                m123invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m123invoke() {
        boolean z13;
        Object obj;
        h a13;
        Object obj2;
        int i13 = 1;
        switch (this.f52867i) {
            case 0:
                i iVar = i.f79272h;
                if (iVar != null) {
                    boolean z14 = iVar.f79279g;
                    ae2.d dVar = this.f52869k;
                    ae2.d dVar2 = this.f52870l;
                    if (z14) {
                        android.support.v4.media.a aVar = this.f52868j;
                        GLES20.glBindFramebuffer(36160, ((j) aVar.f15843g).f138806a[0]);
                        GLES20.glFramebufferTexture2D(36160, 36064, 3553, dVar.f15063b, 0);
                        GLES20.glBindFramebuffer(36160, ((j) aVar.f15842f).f138806a[0]);
                        GLES20.glFramebufferTexture2D(36160, 36064, 3553, dVar2.f15063b, 0);
                        GLES20.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, dVar2.f15060e.getWidth(), dVar2.f15060e.getHeight());
                        return;
                    }
                    if (z14) {
                        return;
                    }
                    GLES30.glBlitFramebuffer(0, 0, dVar.f15060e.getWidth(), dVar.f15060e.getHeight(), 0, 0, dVar2.f15060e.getWidth(), dVar2.f15060e.getHeight(), 16384, 9729);
                    return;
                }
                throw new IllegalStateException("XRendererApp must be initialized first.".toString());
            case 1:
                android.support.v4.media.a aVar2 = this.f52868j;
                e eVar = (e) ((a) ((List) aVar2.f15844h).get(0)).f52866b.get(0);
                ae2.d dVar3 = this.f52869k;
                android.support.v4.media.a.b(aVar2, eVar, dVar3, dVar3, this.f52870l);
                return;
            default:
                android.support.v4.media.a aVar3 = this.f52868j;
                List list = (List) aVar3.f15838b;
                if (((List) aVar3.f15844h).size() != list.size()) {
                    ((List) aVar3.f15844h).clear();
                    List list2 = (List) aVar3.f15844h;
                    List<td2.a> list3 = list;
                    ArrayList arrayList = new ArrayList(g0.q(list3, 10));
                    for (td2.a aVar4 : list3) {
                        IntRange h10 = f0.h(aVar4.f117473b);
                        ArrayList arrayList2 = new ArrayList(g0.q(h10, 10));
                        k it = h10.iterator();
                        while (it.f104109c) {
                            arrayList2.add(new e(aVar4, it.b()));
                        }
                        arrayList.add(new a(aVar4, CollectionsKt.F0(arrayList2)));
                    }
                    k0.u(arrayList, list2);
                }
                ((he.b) this.f52868j.f15840d).a(0);
                ((he.b) this.f52868j.f15841e).a(1);
                if (((List) this.f52868j.f15844h).size() == 1 && ((a) ((List) this.f52868j.f15844h).get(0)).f52866b.size() == 1) {
                    String tag = ((a) ((List) this.f52868j.f15844h).get(0)).f52865a.f117472a;
                    b block = new b(this.f52868j, this.f52870l, this.f52869k, i13);
                    Intrinsics.checkNotNullParameter(tag, "tag");
                    Intrinsics.checkNotNullParameter(block, "block");
                    Intrinsics.checkNotNullParameter(tag, "tag");
                    Intrinsics.checkNotNullParameter(block, "block");
                    block.invoke();
                    return;
                }
                IntRange intRange = new IntRange(0, 1, 1);
                android.support.v4.media.a aVar5 = this.f52868j;
                ae2.d dVar4 = this.f52870l;
                ArrayList arrayList3 = new ArrayList(g0.q(intRange, 10));
                k it2 = intRange.iterator();
                while (true) {
                    if (it2.f104109c) {
                        it2.b();
                        g gVar = (g) ((t72.j) aVar5.f15837a).f116663b;
                        Size size = dVar4.f15060e;
                        ae2.b pixelType = ae2.b.UInt8RGBA;
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(size, "size");
                        Intrinsics.checkNotNullParameter(pixelType, "pixelType");
                        synchronized (gVar) {
                            try {
                                ae2.a aVar6 = new ae2.a(size, pixelType);
                                a13 = gVar.a(aVar6);
                                if (a13 == null) {
                                    Iterator it3 = gVar.f15065a.keySet().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            obj2 = it3.next();
                                            if (((ae2.a) obj2).a(aVar6)) {
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    ae2.a aVar7 = (ae2.a) obj2;
                                    h a14 = aVar7 != null ? gVar.a(aVar7) : null;
                                    if (a14 != null) {
                                        a13 = a14;
                                    } else {
                                        px0.g block2 = new px0.g(size, pixelType, gVar, 27);
                                        Intrinsics.checkNotNullParameter("", "tag");
                                        Intrinsics.checkNotNullParameter(block2, "block");
                                        Intrinsics.checkNotNullParameter("", "tag");
                                        Intrinsics.checkNotNullParameter(block2, "block");
                                        a13 = (h) block2.invoke();
                                    }
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        arrayList3.add(a13);
                    } else {
                        List<h> F0 = CollectionsKt.F0(arrayList3);
                        ArrayList l13 = f0.l(((h) F0.get(0)).f15068b, ((h) F0.get(1)).f15068b, this.f52869k);
                        android.support.v4.media.a.a(this.f52868j, this.f52870l, (ae2.d) l13.get(0));
                        android.support.v4.media.a aVar8 = this.f52868j;
                        for (a aVar9 : (List) aVar8.f15844h) {
                            android.support.v4.media.a.a(aVar8, (ae2.d) l13.get(0), (ae2.d) l13.get(1));
                            String tag2 = aVar9.f52865a.f117472a;
                            px0.g block3 = new px0.g(aVar9, l13, aVar8, 28);
                            Intrinsics.checkNotNullParameter(tag2, "tag");
                            Intrinsics.checkNotNullParameter(block3, "block");
                            Intrinsics.checkNotNullParameter(tag2, "tag");
                            Intrinsics.checkNotNullParameter(block3, "block");
                            block3.invoke();
                            ae2.d dVar5 = (ae2.d) l13.get(0);
                            l13.set(0, l13.get(1));
                            l13.set(1, dVar5);
                        }
                        if (((ae2.d) l13.get(0)).f15063b != this.f52869k.f15063b) {
                            android.support.v4.media.a.a(this.f52868j, (ae2.d) l13.get(0), this.f52869k);
                        }
                        for (h hVar : F0) {
                            g gVar2 = hVar.f15069c;
                            ae2.d texture = hVar.f15068b;
                            gVar2.getClass();
                            Intrinsics.checkNotNullParameter(texture, "texture");
                            synchronized (gVar2) {
                                try {
                                    LinkedHashSet linkedHashSet = gVar2.f15066b;
                                    if (!(linkedHashSet instanceof Collection) || !linkedHashSet.isEmpty()) {
                                        Iterator it4 = linkedHashSet.iterator();
                                        while (it4.hasNext()) {
                                            if (((h) it4.next()).f15068b.f15063b == texture.f15063b) {
                                                z13 = true;
                                            }
                                        }
                                    }
                                    z13 = false;
                                } catch (Throwable th4) {
                                    throw th4;
                                }
                            }
                            if (z13) {
                                g gVar3 = hVar.f15069c;
                                ae2.d texture2 = hVar.f15068b;
                                gVar3.getClass();
                                Intrinsics.checkNotNullParameter(texture2, "texture");
                                synchronized (gVar3) {
                                    try {
                                        Iterator it5 = gVar3.f15066b.iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                obj = it5.next();
                                                if (((h) obj).f15068b.f15063b == texture2.f15063b) {
                                                }
                                            } else {
                                                obj = null;
                                            }
                                        }
                                        h hVar2 = (h) obj;
                                        if (hVar2 != null) {
                                            gVar3.f15066b.remove(hVar2);
                                            LinkedHashMap linkedHashMap = gVar3.f15065a;
                                            ae2.a aVar10 = hVar2.f15067a;
                                            Object obj3 = linkedHashMap.get(aVar10);
                                            if (obj3 == null) {
                                                obj3 = new ArrayList();
                                                linkedHashMap.put(aVar10, obj3);
                                            }
                                            ((List) obj3).add(texture2);
                                        } else {
                                            throw new IllegalStateException("Texture is not held");
                                        }
                                    } catch (Throwable th5) {
                                        throw th5;
                                    }
                                }
                            } else {
                                throw new IllegalStateException("Texture is already returned to the cache");
                            }
                        }
                        return;
                    }
                }
                break;
        }
    }
}
