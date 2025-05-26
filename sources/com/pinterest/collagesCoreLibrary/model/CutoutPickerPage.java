package com.pinterest.collagesCoreLibrary.model;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u50.i0;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/pinterest/collagesCoreLibrary/model/CutoutPickerPage;", "Landroid/os/Parcelable;", "BoardPage", "OriginPage", "Lcom/pinterest/collagesCoreLibrary/model/CutoutPickerPage$BoardPage;", "Lcom/pinterest/collagesCoreLibrary/model/CutoutPickerPage$OriginPage;", "collagesCoreLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class CutoutPickerPage implements Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/collagesCoreLibrary/model/CutoutPickerPage$BoardPage;", "Lcom/pinterest/collagesCoreLibrary/model/CutoutPickerPage;", "collagesCoreLibrary_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class BoardPage extends CutoutPickerPage {

        @NotNull
        public static final Parcelable.Creator<BoardPage> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f44679a;

        /* renamed from: b, reason: collision with root package name */
        public final String f44680b;

        public BoardPage(String id3, String name) {
            Intrinsics.checkNotNullParameter(id3, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            this.f44679a = id3;
            this.f44680b = name;
        }

        @Override // com.pinterest.collagesCoreLibrary.model.CutoutPickerPage
        public final i0 a() {
            return c.h2(this.f44680b);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BoardPage)) {
                return false;
            }
            BoardPage boardPage = (BoardPage) obj;
            return Intrinsics.d(this.f44679a, boardPage.f44679a) && Intrinsics.d(this.f44680b, boardPage.f44680b);
        }

        public final int hashCode() {
            return this.f44680b.hashCode() + (this.f44679a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("BoardPage(id=");
            sb3.append(this.f44679a);
            sb3.append(", name=");
            return a.a.p(sb3, this.f44680b, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeString(this.f44679a);
            parcel.writeString(this.f44680b);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/collagesCoreLibrary/model/CutoutPickerPage$OriginPage;", "Lcom/pinterest/collagesCoreLibrary/model/CutoutPickerPage;", "collagesCoreLibrary_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class OriginPage extends CutoutPickerPage {

        @NotNull
        public static final Parcelable.Creator<OriginPage> CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        public final CutoutPickerOrigin f44681a;

        public OriginPage(CutoutPickerOrigin origin) {
            Intrinsics.checkNotNullParameter(origin, "origin");
            this.f44681a = origin;
        }

        @Override // com.pinterest.collagesCoreLibrary.model.CutoutPickerPage
        public final i0 a() {
            return c.j2(new String[0], this.f44681a.getTitleResId());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return this.f44681a.describeContents();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OriginPage) && this.f44681a == ((OriginPage) obj).f44681a;
        }

        public final int hashCode() {
            return this.f44681a.hashCode();
        }

        public final String toString() {
            return "OriginPage(origin=" + this.f44681a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            this.f44681a.writeToParcel(parcel, i13);
        }
    }

    public abstract i0 a();
}
