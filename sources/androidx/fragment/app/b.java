package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18287a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f18287a) {
            case 0:
                return new BackStackRecordState(parcel);
            case 1:
                return new BackStackState(parcel);
            case 2:
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = new FragmentManager$LaunchedFragmentInfo();
                fragmentManager$LaunchedFragmentInfo.f18238a = parcel.readString();
                fragmentManager$LaunchedFragmentInfo.f18239b = parcel.readInt();
                return fragmentManager$LaunchedFragmentInfo;
            case 3:
                FragmentManagerState fragmentManagerState = new FragmentManagerState();
                fragmentManagerState.f18244e = null;
                fragmentManagerState.f18245f = new ArrayList();
                fragmentManagerState.f18246g = new ArrayList();
                fragmentManagerState.f18240a = parcel.createStringArrayList();
                fragmentManagerState.f18241b = parcel.createStringArrayList();
                fragmentManagerState.f18242c = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
                fragmentManagerState.f18243d = parcel.readInt();
                fragmentManagerState.f18244e = parcel.readString();
                fragmentManagerState.f18245f = parcel.createStringArrayList();
                fragmentManagerState.f18246g = parcel.createTypedArrayList(BackStackState.CREATOR);
                fragmentManagerState.f18247h = parcel.createTypedArrayList(FragmentManager$LaunchedFragmentInfo.CREATOR);
                return fragmentManagerState;
            default:
                return new FragmentState(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f18287a) {
            case 0:
                return new BackStackRecordState[i13];
            case 1:
                return new BackStackState[i13];
            case 2:
                return new FragmentManager$LaunchedFragmentInfo[i13];
            case 3:
                return new FragmentManagerState[i13];
            default:
                return new FragmentState[i13];
        }
    }
}
