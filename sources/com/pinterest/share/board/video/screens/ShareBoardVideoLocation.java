package com.pinterest.share.board.video.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import org.jetbrains.annotations.NotNull;
import s52.n;
import t52.d;
import u52.l;
import y52.x0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\u0081\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012j\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, d2 = {"Lcom/pinterest/share/board/video/screens/ShareBoardVideoLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "shouldKeepOldScreenVisible", "Z", "getShouldKeepOldScreenVisible", "()Z", "shouldShowMainNavigation", "getShouldShowMainNavigation", "shouldSkipTransitions", "getShouldSkipTransitions", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/share/board/video/screens/a", "SHARE_BOARD_VIDEO_SHEET", "SHARE_BOARD_PIN_SELECTION_SHEET", "SHARE_BOARD_TEMPLATE_GALLERY_SHEET", "SHARE_BOARD_MODAL_PROMPT", "shareBoardVideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class ShareBoardVideoLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ ShareBoardVideoLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<ShareBoardVideoLocation> CREATOR;

    @NotNull
    public static final a Companion;
    private final boolean shouldKeepOldScreenVisible;
    private final boolean shouldShowMainNavigation;
    private final boolean shouldSkipTransitions;
    public static final ShareBoardVideoLocation SHARE_BOARD_VIDEO_SHEET = new ShareBoardVideoLocation() { // from class: com.pinterest.share.board.video.screens.ShareBoardVideoLocation.SHARE_BOARD_VIDEO_SHEET

        /* renamed from: a, reason: collision with root package name */
        public final Class f51845a = x0.class;

        @Override // com.pinterest.share.board.video.screens.ShareBoardVideoLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48906a() {
            return this.f51845a;
        }
    };
    public static final ShareBoardVideoLocation SHARE_BOARD_PIN_SELECTION_SHEET = new ShareBoardVideoLocation() { // from class: com.pinterest.share.board.video.screens.ShareBoardVideoLocation.SHARE_BOARD_PIN_SELECTION_SHEET

        /* renamed from: a, reason: collision with root package name */
        public final Class f51843a = n.class;

        @Override // com.pinterest.share.board.video.screens.ShareBoardVideoLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48906a() {
            return this.f51843a;
        }

        @Override // com.pinterest.share.board.video.screens.ShareBoardVideoLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible */
        public final boolean getF48903b() {
            return true;
        }
    };
    public static final ShareBoardVideoLocation SHARE_BOARD_TEMPLATE_GALLERY_SHEET = new ShareBoardVideoLocation() { // from class: com.pinterest.share.board.video.screens.ShareBoardVideoLocation.SHARE_BOARD_TEMPLATE_GALLERY_SHEET

        /* renamed from: a, reason: collision with root package name */
        public final Class f51844a = l.class;

        @Override // com.pinterest.share.board.video.screens.ShareBoardVideoLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48906a() {
            return this.f51844a;
        }
    };
    public static final ShareBoardVideoLocation SHARE_BOARD_MODAL_PROMPT = new ShareBoardVideoLocation() { // from class: com.pinterest.share.board.video.screens.ShareBoardVideoLocation.SHARE_BOARD_MODAL_PROMPT

        /* renamed from: a, reason: collision with root package name */
        public final boolean f51841a = true;

        /* renamed from: b, reason: collision with root package name */
        public final Class f51842b = d.class;

        @Override // com.pinterest.share.board.video.screens.ShareBoardVideoLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48906a() {
            return this.f51842b;
        }

        @Override // com.pinterest.share.board.video.screens.ShareBoardVideoLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF48903b() {
            return this.f51841a;
        }
    };

    private static final /* synthetic */ ShareBoardVideoLocation[] $values() {
        return new ShareBoardVideoLocation[]{SHARE_BOARD_VIDEO_SHEET, SHARE_BOARD_PIN_SELECTION_SHEET, SHARE_BOARD_TEMPLATE_GALLERY_SHEET, SHARE_BOARD_MODAL_PROMPT};
    }

    static {
        ShareBoardVideoLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
        CREATOR = new com.pinterest.feature.todaytab.a(22);
    }

    public /* synthetic */ ShareBoardVideoLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static ShareBoardVideoLocation valueOf(String str) {
        return (ShareBoardVideoLocation) Enum.valueOf(ShareBoardVideoLocation.class, str);
    }

    public static ShareBoardVideoLocation[] values() {
        return (ShareBoardVideoLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public g getF48904c() {
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
    public abstract /* synthetic */ Class getF48906a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
    public boolean getF48903b() {
        return this.shouldKeepOldScreenVisible;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF48905d() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation, reason: from getter */
    public boolean getF46867b() {
        return this.shouldShowMainNavigation;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions, reason: from getter */
    public boolean getF48898c() {
        return this.shouldSkipTransitions;
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

    private ShareBoardVideoLocation(String str, int i13) {
        this.shouldSkipTransitions = true;
    }
}
