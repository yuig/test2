package e8;

import androidx.media3.common.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import z7.n;

/* loaded from: classes3.dex */
public final class c implements n {

    /* renamed from: a, reason: collision with root package name */
    public final int f57717a;

    /* renamed from: b, reason: collision with root package name */
    public final int f57718b;

    /* renamed from: c, reason: collision with root package name */
    public final int f57719c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f57720d;

    /* renamed from: e, reason: collision with root package name */
    public final a f57721e;

    /* renamed from: f, reason: collision with root package name */
    public final b[] f57722f;

    /* renamed from: g, reason: collision with root package name */
    public final long f57723g;

    /* renamed from: h, reason: collision with root package name */
    public final long f57724h;

    public c(int i13, int i14, long j13, long j14, int i15, boolean z13, a aVar, b[] bVarArr) {
        this.f57717a = i13;
        this.f57718b = i14;
        this.f57723g = j13;
        this.f57724h = j14;
        this.f57719c = i15;
        this.f57720d = z13;
        this.f57721e = aVar;
        this.f57722f = bVarArr;
    }

    @Override // z7.n
    public final Object a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            StreamKey streamKey = (StreamKey) arrayList.get(i13);
            b bVar2 = this.f57722f[streamKey.f18748b];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.b((androidx.media3.common.b[]) arrayList3.toArray(new androidx.media3.common.b[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f57710j[streamKey.f18749c]);
            i13++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.b((androidx.media3.common.b[]) arrayList3.toArray(new androidx.media3.common.b[0])));
        }
        return new c(this.f57717a, this.f57718b, this.f57723g, this.f57724h, this.f57719c, this.f57720d, this.f57721e, (b[]) arrayList2.toArray(new b[0]));
    }
}
