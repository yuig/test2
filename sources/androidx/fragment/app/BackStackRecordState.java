package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new b(0);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f18216a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18217b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f18218c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f18219d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18220e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18221f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18222g;

    /* renamed from: h, reason: collision with root package name */
    public final int f18223h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f18224i;

    /* renamed from: j, reason: collision with root package name */
    public final int f18225j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f18226k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f18227l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f18228m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f18229n;

    public BackStackRecordState(a aVar) {
        int size = aVar.f18266a.size();
        this.f18216a = new int[size * 6];
        if (!aVar.f18272g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f18217b = new ArrayList(size);
        this.f18218c = new int[size];
        this.f18219d = new int[size];
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            g1 g1Var = (g1) aVar.f18266a.get(i14);
            int i15 = i13 + 1;
            this.f18216a[i13] = g1Var.f18328a;
            ArrayList arrayList = this.f18217b;
            Fragment fragment = g1Var.f18329b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f18216a;
            iArr[i15] = g1Var.f18330c ? 1 : 0;
            iArr[i13 + 2] = g1Var.f18331d;
            iArr[i13 + 3] = g1Var.f18332e;
            int i16 = i13 + 5;
            iArr[i13 + 4] = g1Var.f18333f;
            i13 += 6;
            iArr[i16] = g1Var.f18334g;
            this.f18218c[i14] = g1Var.f18335h.ordinal();
            this.f18219d[i14] = g1Var.f18336i.ordinal();
        }
        this.f18220e = aVar.f18271f;
        this.f18221f = aVar.f18274i;
        this.f18222g = aVar.f18284s;
        this.f18223h = aVar.f18275j;
        this.f18224i = aVar.f18276k;
        this.f18225j = aVar.f18277l;
        this.f18226k = aVar.f18278m;
        this.f18227l = aVar.f18279n;
        this.f18228m = aVar.f18280o;
        this.f18229n = aVar.f18281p;
    }

    public final void a(a aVar) {
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.f18216a;
            boolean z13 = true;
            if (i13 >= iArr.length) {
                aVar.f18271f = this.f18220e;
                aVar.f18274i = this.f18221f;
                aVar.f18272g = true;
                aVar.f18275j = this.f18223h;
                aVar.f18276k = this.f18224i;
                aVar.f18277l = this.f18225j;
                aVar.f18278m = this.f18226k;
                aVar.f18279n = this.f18227l;
                aVar.f18280o = this.f18228m;
                aVar.f18281p = this.f18229n;
                return;
            }
            g1 g1Var = new g1();
            int i15 = i13 + 1;
            g1Var.f18328a = iArr[i13];
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i14 + " base fragment #" + iArr[i15]);
            }
            g1Var.f18335h = androidx.lifecycle.r.values()[this.f18218c[i14]];
            g1Var.f18336i = androidx.lifecycle.r.values()[this.f18219d[i14]];
            int i16 = i13 + 2;
            if (iArr[i15] == 0) {
                z13 = false;
            }
            g1Var.f18330c = z13;
            int i17 = iArr[i16];
            g1Var.f18331d = i17;
            int i18 = iArr[i13 + 3];
            g1Var.f18332e = i18;
            int i19 = i13 + 5;
            int i23 = iArr[i13 + 4];
            g1Var.f18333f = i23;
            i13 += 6;
            int i24 = iArr[i19];
            g1Var.f18334g = i24;
            aVar.f18267b = i17;
            aVar.f18268c = i18;
            aVar.f18269d = i23;
            aVar.f18270e = i24;
            aVar.b(g1Var);
            i14++;
        }
    }

    public final a b(w0 w0Var) {
        a aVar = new a(w0Var);
        a(aVar);
        aVar.f18284s = this.f18222g;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f18217b;
            if (i13 >= arrayList.size()) {
                aVar.d(1);
                return aVar;
            }
            String str = (String) arrayList.get(i13);
            if (str != null) {
                ((g1) aVar.f18266a.get(i13)).f18329b = w0Var.f18451c.b(str);
            }
            i13++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeIntArray(this.f18216a);
        parcel.writeStringList(this.f18217b);
        parcel.writeIntArray(this.f18218c);
        parcel.writeIntArray(this.f18219d);
        parcel.writeInt(this.f18220e);
        parcel.writeString(this.f18221f);
        parcel.writeInt(this.f18222g);
        parcel.writeInt(this.f18223h);
        TextUtils.writeToParcel(this.f18224i, parcel, 0);
        parcel.writeInt(this.f18225j);
        TextUtils.writeToParcel(this.f18226k, parcel, 0);
        parcel.writeStringList(this.f18227l);
        parcel.writeStringList(this.f18228m);
        parcel.writeInt(this.f18229n ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f18216a = parcel.createIntArray();
        this.f18217b = parcel.createStringArrayList();
        this.f18218c = parcel.createIntArray();
        this.f18219d = parcel.createIntArray();
        this.f18220e = parcel.readInt();
        this.f18221f = parcel.readString();
        this.f18222g = parcel.readInt();
        this.f18223h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f18224i = (CharSequence) creator.createFromParcel(parcel);
        this.f18225j = parcel.readInt();
        this.f18226k = (CharSequence) creator.createFromParcel(parcel);
        this.f18227l = parcel.createStringArrayList();
        this.f18228m = parcel.createStringArrayList();
        this.f18229n = parcel.readInt() != 0;
    }
}
