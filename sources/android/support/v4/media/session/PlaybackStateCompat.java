package android.support.v4.media.session;

import a.d;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import f0.h;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new d(14);

    /* renamed from: a, reason: collision with root package name */
    public final int f15854a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15855b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15856c;

    /* renamed from: d, reason: collision with root package name */
    public final float f15857d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15858e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15859f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f15860g;

    /* renamed from: h, reason: collision with root package name */
    public final long f15861h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f15862i;

    /* renamed from: j, reason: collision with root package name */
    public final long f15863j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f15864k;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f15865a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f15866b;

        /* renamed from: c, reason: collision with root package name */
        public final int f15867c;

        /* renamed from: d, reason: collision with root package name */
        public final Bundle f15868d;

        public CustomAction(Parcel parcel) {
            this.f15865a = parcel.readString();
            this.f15866b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f15867c = parcel.readInt();
            this.f15868d = parcel.readBundle(h.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f15866b) + ", mIcon=" + this.f15867c + ", mExtras=" + this.f15868d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.writeString(this.f15865a);
            TextUtils.writeToParcel(this.f15866b, parcel, i13);
            parcel.writeInt(this.f15867c);
            parcel.writeBundle(this.f15868d);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f15854a = parcel.readInt();
        this.f15855b = parcel.readLong();
        this.f15857d = parcel.readFloat();
        this.f15861h = parcel.readLong();
        this.f15856c = parcel.readLong();
        this.f15858e = parcel.readLong();
        this.f15860g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f15862i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f15863j = parcel.readLong();
        this.f15864k = parcel.readBundle(h.class.getClassLoader());
        this.f15859f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PlaybackState {state=");
        sb3.append(this.f15854a);
        sb3.append(", position=");
        sb3.append(this.f15855b);
        sb3.append(", buffered position=");
        sb3.append(this.f15856c);
        sb3.append(", speed=");
        sb3.append(this.f15857d);
        sb3.append(", updated=");
        sb3.append(this.f15861h);
        sb3.append(", actions=");
        sb3.append(this.f15858e);
        sb3.append(", error code=");
        sb3.append(this.f15859f);
        sb3.append(", error message=");
        sb3.append(this.f15860g);
        sb3.append(", custom actions=");
        sb3.append(this.f15862i);
        sb3.append(", active item id=");
        return a.a.o(sb3, this.f15863j, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f15854a);
        parcel.writeLong(this.f15855b);
        parcel.writeFloat(this.f15857d);
        parcel.writeLong(this.f15861h);
        parcel.writeLong(this.f15856c);
        parcel.writeLong(this.f15858e);
        TextUtils.writeToParcel(this.f15860g, parcel, i13);
        parcel.writeTypedList(this.f15862i);
        parcel.writeLong(this.f15863j);
        parcel.writeBundle(this.f15864k);
        parcel.writeInt(this.f15859f);
    }
}
