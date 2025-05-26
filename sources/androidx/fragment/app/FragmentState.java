package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.feature.core.view.RecyclerViewTypes;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new b(4);

    /* renamed from: a, reason: collision with root package name */
    public final String f18248a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18249b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18250c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18251d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18252e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18253f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f18254g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f18255h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f18256i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f18257j;

    /* renamed from: k, reason: collision with root package name */
    public final int f18258k;

    /* renamed from: l, reason: collision with root package name */
    public final String f18259l;

    /* renamed from: m, reason: collision with root package name */
    public final int f18260m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f18261n;

    public FragmentState(Fragment fragment) {
        this.f18248a = fragment.getClass().getName();
        this.f18249b = fragment.mWho;
        this.f18250c = fragment.mFromLayout;
        this.f18251d = fragment.mFragmentId;
        this.f18252e = fragment.mContainerId;
        this.f18253f = fragment.mTag;
        this.f18254g = fragment.mRetainInstance;
        this.f18255h = fragment.mRemoving;
        this.f18256i = fragment.mDetached;
        this.f18257j = fragment.mHidden;
        this.f18258k = fragment.mMaxState.ordinal();
        this.f18259l = fragment.mTargetWho;
        this.f18260m = fragment.mTargetRequestCode;
        this.f18261n = fragment.mUserVisibleHint;
    }

    public final Fragment a(f0 f0Var, ClassLoader classLoader) {
        Fragment a13 = f0Var.a(classLoader, this.f18248a);
        a13.mWho = this.f18249b;
        a13.mFromLayout = this.f18250c;
        a13.mRestored = true;
        a13.mFragmentId = this.f18251d;
        a13.mContainerId = this.f18252e;
        a13.mTag = this.f18253f;
        a13.mRetainInstance = this.f18254g;
        a13.mRemoving = this.f18255h;
        a13.mDetached = this.f18256i;
        a13.mHidden = this.f18257j;
        a13.mMaxState = androidx.lifecycle.r.values()[this.f18258k];
        a13.mTargetWho = this.f18259l;
        a13.mTargetRequestCode = this.f18260m;
        a13.mUserVisibleHint = this.f18261n;
        return a13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        sb3.append("FragmentState{");
        sb3.append(this.f18248a);
        sb3.append(" (");
        sb3.append(this.f18249b);
        sb3.append(")}:");
        if (this.f18250c) {
            sb3.append(" fromLayout");
        }
        int i13 = this.f18252e;
        if (i13 != 0) {
            sb3.append(" id=0x");
            sb3.append(Integer.toHexString(i13));
        }
        String str = this.f18253f;
        if (str != null && !str.isEmpty()) {
            sb3.append(" tag=");
            sb3.append(str);
        }
        if (this.f18254g) {
            sb3.append(" retainInstance");
        }
        if (this.f18255h) {
            sb3.append(" removing");
        }
        if (this.f18256i) {
            sb3.append(" detached");
        }
        if (this.f18257j) {
            sb3.append(" hidden");
        }
        String str2 = this.f18259l;
        if (str2 != null) {
            sb3.append(" targetWho=");
            sb3.append(str2);
            sb3.append(" targetRequestCode=");
            sb3.append(this.f18260m);
        }
        if (this.f18261n) {
            sb3.append(" userVisibleHint");
        }
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f18248a);
        parcel.writeString(this.f18249b);
        parcel.writeInt(this.f18250c ? 1 : 0);
        parcel.writeInt(this.f18251d);
        parcel.writeInt(this.f18252e);
        parcel.writeString(this.f18253f);
        parcel.writeInt(this.f18254g ? 1 : 0);
        parcel.writeInt(this.f18255h ? 1 : 0);
        parcel.writeInt(this.f18256i ? 1 : 0);
        parcel.writeInt(this.f18257j ? 1 : 0);
        parcel.writeInt(this.f18258k);
        parcel.writeString(this.f18259l);
        parcel.writeInt(this.f18260m);
        parcel.writeInt(this.f18261n ? 1 : 0);
    }

    public FragmentState(Parcel parcel) {
        this.f18248a = parcel.readString();
        this.f18249b = parcel.readString();
        this.f18250c = parcel.readInt() != 0;
        this.f18251d = parcel.readInt();
        this.f18252e = parcel.readInt();
        this.f18253f = parcel.readString();
        this.f18254g = parcel.readInt() != 0;
        this.f18255h = parcel.readInt() != 0;
        this.f18256i = parcel.readInt() != 0;
        this.f18257j = parcel.readInt() != 0;
        this.f18258k = parcel.readInt();
        this.f18259l = parcel.readString();
        this.f18260m = parcel.readInt();
        this.f18261n = parcel.readInt() != 0;
    }
}
