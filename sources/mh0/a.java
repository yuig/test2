package mh0;

import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lb0.g;
import nh0.b;
import nm.u;
import rz.d;
import vd0.c;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final ph0.a f87155a;

    /* renamed from: b, reason: collision with root package name */
    public final g f87156b;

    public a(ph0.a devOptionsContainer, g diskCache) {
        Intrinsics.checkNotNullParameter(devOptionsContainer, "devOptionsContainer");
        Intrinsics.checkNotNullParameter(diskCache, "diskCache");
        this.f87155a = devOptionsContainer;
        this.f87156b = diskCache;
    }

    @Override // rz.d
    public final Object b(c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        c cVar = new c(pinterestJsonObject.f125623a.v("data").i());
        LinkedHashMap linkedHashMap = this.f87155a.f100157a;
        if (linkedHashMap.isEmpty()) {
            throw new IllegalStateException("Cannot access the experiment dev groups from the container");
        }
        Unit unit = Unit.f80348a;
        boolean z13 = !linkedHashMap.isEmpty();
        u uVar = cVar.f125623a;
        if (z13) {
            HashSet hashSet = new HashSet();
            hashSet.addAll(cVar.g());
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!linkedHashMap.containsKey(str)) {
                    uVar.y(str);
                }
            }
        }
        nh0.a a13 = b.a(cVar);
        this.f87156b.getClass();
        if (com.bumptech.glide.d.D0(new File(g.c("MY_EXPERIMENTS", true)), uVar.toString())) {
            return a13;
        }
        throw new IllegalStateException("Cannot save experiments into the disk cache");
    }
}
