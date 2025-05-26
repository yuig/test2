package q7;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import d7.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements z7.n {

    /* renamed from: a, reason: collision with root package name */
    public final long f102604a;

    /* renamed from: b, reason: collision with root package name */
    public final long f102605b;

    /* renamed from: c, reason: collision with root package name */
    public final long f102606c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f102607d;

    /* renamed from: e, reason: collision with root package name */
    public final long f102608e;

    /* renamed from: f, reason: collision with root package name */
    public final long f102609f;

    /* renamed from: g, reason: collision with root package name */
    public final long f102610g;

    /* renamed from: h, reason: collision with root package name */
    public final long f102611h;

    /* renamed from: i, reason: collision with root package name */
    public final w f102612i;

    /* renamed from: j, reason: collision with root package name */
    public final t f102613j;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f102614k;

    /* renamed from: l, reason: collision with root package name */
    public final i f102615l;

    /* renamed from: m, reason: collision with root package name */
    public final List f102616m;

    public c(long j13, long j14, long j15, boolean z13, long j16, long j17, long j18, long j19, i iVar, w wVar, t tVar, Uri uri, ArrayList arrayList) {
        this.f102604a = j13;
        this.f102605b = j14;
        this.f102606c = j15;
        this.f102607d = z13;
        this.f102608e = j16;
        this.f102609f = j17;
        this.f102610g = j18;
        this.f102611h = j19;
        this.f102615l = iVar;
        this.f102612i = wVar;
        this.f102614k = uri;
        this.f102613j = tVar;
        this.f102616m = arrayList;
    }

    @Override // z7.n
    public final Object a(List list) {
        ArrayList arrayList;
        long j13;
        ArrayList arrayList2;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey(-1, -1, -1));
        ArrayList arrayList3 = new ArrayList();
        long j14 = 0;
        int i13 = 0;
        while (true) {
            if (i13 >= this.f102616m.size()) {
                break;
            }
            if (((StreamKey) linkedList.peek()).f18747a != i13) {
                long c13 = c(i13);
                if (c13 != -9223372036854775807L) {
                    j14 += c13;
                }
                j13 = j14;
                arrayList2 = arrayList3;
            } else {
                h b13 = b(i13);
                List list2 = b13.f102641c;
                StreamKey streamKey = (StreamKey) linkedList.poll();
                int i14 = streamKey.f18747a;
                ArrayList arrayList4 = new ArrayList();
                while (true) {
                    int i15 = streamKey.f18748b;
                    a aVar = (a) list2.get(i15);
                    List list3 = aVar.f102596c;
                    ArrayList arrayList5 = new ArrayList();
                    do {
                        arrayList5.add((m) list3.get(streamKey.f18749c));
                        streamKey = (StreamKey) linkedList.poll();
                        if (streamKey.f18747a != i14) {
                            break;
                        }
                    } while (streamKey.f18748b == i15);
                    arrayList = arrayList3;
                    j13 = j14;
                    arrayList4.add(new a(aVar.f102594a, aVar.f102595b, arrayList5, aVar.f102597d, aVar.f102598e, aVar.f102599f));
                    if (streamKey.f18747a != i14) {
                        break;
                    }
                    arrayList3 = arrayList;
                    j14 = j13;
                }
                linkedList.addFirst(streamKey);
                arrayList2 = arrayList;
                arrayList2.add(new h(b13.f102639a, b13.f102640b - j13, arrayList4, b13.f102642d, null));
            }
            i13++;
            arrayList3 = arrayList2;
            j14 = j13;
        }
        long j15 = j14;
        ArrayList arrayList6 = arrayList3;
        long j16 = this.f102605b;
        return new c(this.f102604a, j16 != -9223372036854775807L ? j16 - j15 : -9223372036854775807L, this.f102606c, this.f102607d, this.f102608e, this.f102609f, this.f102610g, this.f102611h, this.f102615l, this.f102612i, this.f102613j, this.f102614k, arrayList6);
    }

    public final h b(int i13) {
        return (h) this.f102616m.get(i13);
    }

    public final long c(int i13) {
        long j13;
        long j14;
        List list = this.f102616m;
        if (i13 == list.size() - 1) {
            j13 = this.f102605b;
            if (j13 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j14 = ((h) list.get(i13)).f102640b;
        } else {
            j13 = ((h) list.get(i13 + 1)).f102640b;
            j14 = ((h) list.get(i13)).f102640b;
        }
        return j13 - j14;
    }

    public final long d(int i13) {
        return n0.X(c(i13));
    }
}
