package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new b(1);

    /* renamed from: a, reason: collision with root package name */
    public final List f18230a;

    /* renamed from: b, reason: collision with root package name */
    public final List f18231b;

    public BackStackState(ArrayList arrayList, ArrayList arrayList2) {
        this.f18230a = arrayList;
        this.f18231b = arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d2, code lost:
    
        r10.add(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList a(androidx.fragment.app.w0 r9, java.util.HashMap r10) {
        /*
            r8 = this;
            java.util.HashMap r0 = new java.util.HashMap
            java.util.List r1 = r8.f18230a
            int r2 = r1.size()
            r0.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L72
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r10.get(r2)
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L29
            java.lang.String r2 = r3.mWho
            r0.put(r2, r3)
            goto Lf
        L29:
            r3 = 0
            androidx.fragment.app.e1 r4 = r9.f18451c
            android.os.Bundle r2 = r4.j(r2, r3)
            if (r2 == 0) goto Lf
            androidx.fragment.app.g0 r3 = r9.f18470v
            android.content.Context r3 = r3.f18325b
            java.lang.ClassLoader r3 = r3.getClassLoader()
            java.lang.String r4 = "state"
            android.os.Parcelable r4 = r2.getParcelable(r4)
            androidx.fragment.app.FragmentState r4 = (androidx.fragment.app.FragmentState) r4
            androidx.fragment.app.f0 r5 = r9.J()
            androidx.fragment.app.Fragment r4 = r4.a(r5, r3)
            r4.mSavedFragmentState = r2
            java.lang.String r5 = "savedInstanceState"
            android.os.Bundle r6 = r2.getBundle(r5)
            if (r6 != 0) goto L5e
            android.os.Bundle r6 = r4.mSavedFragmentState
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            r6.putBundle(r5, r7)
        L5e:
            java.lang.String r5 = "arguments"
            android.os.Bundle r2 = r2.getBundle(r5)
            if (r2 == 0) goto L69
            r2.setClassLoader(r3)
        L69:
            r4.setArguments(r2)
            java.lang.String r2 = r4.mWho
            r0.put(r2, r4)
            goto Lf
        L72:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.List r1 = r8.f18231b
            java.util.Iterator r1 = r1.iterator()
        L7d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Ld6
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.BackStackRecordState r2 = (androidx.fragment.app.BackStackRecordState) r2
            r2.getClass()
            androidx.fragment.app.a r3 = new androidx.fragment.app.a
            r3.<init>(r9)
            r2.a(r3)
            r4 = 0
        L95:
            java.util.ArrayList r5 = r2.f18217b
            int r6 = r5.size()
            if (r4 >= r6) goto Ld2
            java.lang.Object r5 = r5.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto Lcf
            java.lang.Object r6 = r0.get(r5)
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            if (r6 == 0) goto Lb8
            java.util.ArrayList r5 = r3.f18266a
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.g1 r5 = (androidx.fragment.app.g1) r5
            r5.f18329b = r6
            goto Lcf
        Lb8:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Restoring FragmentTransaction "
            r10.<init>(r0)
            java.lang.String r0 = r2.f18221f
            java.lang.String r1 = " failed due to missing saved state for Fragment ("
            java.lang.String r2 = ")"
            java.lang.String r10 = a.a.q(r10, r0, r1, r5, r2)
            r9.<init>(r10)
            throw r9
        Lcf:
            int r4 = r4 + 1
            goto L95
        Ld2:
            r10.add(r3)
            goto L7d
        Ld6:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.BackStackState.a(androidx.fragment.app.w0, java.util.HashMap):java.util.ArrayList");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeStringList(this.f18230a);
        parcel.writeTypedList(this.f18231b);
    }

    public BackStackState(Parcel parcel) {
        this.f18230a = parcel.createStringArrayList();
        this.f18231b = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }
}
