package com.pinterest.feature.board.edit;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import ml0.w;
import nx.f1;
import ol0.f;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/pinterest/feature/board/edit/BoardEditFeatureLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/feature/board/edit/b", "BOARD_EDIT_FRAGMENT", "BOARD_HEADER_IMAGE_SELECTOR_FRAGMENT", "edit_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class BoardEditFeatureLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ BoardEditFeatureLocation[] $VALUES;
    public static final BoardEditFeatureLocation BOARD_EDIT_FRAGMENT = new BoardEditFeatureLocation() { // from class: com.pinterest.feature.board.edit.BoardEditFeatureLocation.BOARD_EDIT_FRAGMENT

        /* renamed from: a, reason: collision with root package name */
        public final Class f45244a = f.class;

        /* renamed from: b, reason: collision with root package name */
        public final g f45245b = g.MODAL;

        @Override // com.pinterest.feature.board.edit.BoardEditFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF44613b() {
            return this.f45245b;
        }

        @Override // com.pinterest.feature.board.edit.BoardEditFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF44614a() {
            return this.f45244a;
        }
    };
    public static final BoardEditFeatureLocation BOARD_HEADER_IMAGE_SELECTOR_FRAGMENT = new BoardEditFeatureLocation() { // from class: com.pinterest.feature.board.edit.BoardEditFeatureLocation.BOARD_HEADER_IMAGE_SELECTOR_FRAGMENT

        /* renamed from: a, reason: collision with root package name */
        public final Class f45246a = w.class;

        /* renamed from: b, reason: collision with root package name */
        public final g f45247b = g.MODAL;

        @Override // com.pinterest.feature.board.edit.BoardEditFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF44613b() {
            return this.f45247b;
        }

        @Override // com.pinterest.feature.board.edit.BoardEditFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF44614a() {
            return this.f45246a;
        }
    };

    @NotNull
    public static final Parcelable.Creator<BoardEditFeatureLocation> CREATOR;

    @NotNull
    public static final b Companion;

    private static final /* synthetic */ BoardEditFeatureLocation[] $values() {
        return new BoardEditFeatureLocation[]{BOARD_EDIT_FRAGMENT, BOARD_HEADER_IMAGE_SELECTOR_FRAGMENT};
    }

    static {
        BoardEditFeatureLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new b();
        CREATOR = new f1(27);
    }

    public /* synthetic */ BoardEditFeatureLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static BoardEditFeatureLocation valueOf(String str) {
        return (BoardEditFeatureLocation) Enum.valueOf(BoardEditFeatureLocation.class, str);
    }

    public static BoardEditFeatureLocation[] values() {
        return (BoardEditFeatureLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public g getF44613b() {
        return g.DEFAULT;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    public kl1.a getEarlyAccessKey() {
        return kl1.a.LateAccessScreenKey;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public /* bridge */ /* synthetic */ String getName() {
        return name();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getScreenClass */
    public abstract /* synthetic */ Class getF44614a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF45669b() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF52827d() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF45109b() {
        return super.getF45109b();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF50296c() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public /* bridge */ /* synthetic */ boolean getSupportsStateRestorationOnlyUseInEmergencies() {
        return true;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public void onScreenNavigation() {
    }

    @Override // com.pinterest.framework.screens.ScreenLocation, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }

    private BoardEditFeatureLocation(String str, int i13) {
    }
}
