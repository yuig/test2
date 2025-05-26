package com.pinterest.feature.board;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import nx.f1;
import org.jetbrains.annotations.NotNull;
import tj0.h;
import tj0.k;
import tj0.m;
import tj0.t;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/pinterest/feature/board/BoardFeatureLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/feature/board/a", "BOARD_MORE_IDEAS_TAB", "BOARD_MORE_IDEAS_TOOL", "BOARD_MORE_IDEAS_BOTTOM_SHEET", "BOARD_SECTION_MORE_IDEAS_TOOL", "ABOUT_BOARD_RECOMMENDATIONS_MODAL", "default_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class BoardFeatureLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ BoardFeatureLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<BoardFeatureLocation> CREATOR;

    @NotNull
    public static final a Companion;
    public static final BoardFeatureLocation BOARD_MORE_IDEAS_TAB = new BoardFeatureLocation() { // from class: com.pinterest.feature.board.BoardFeatureLocation.BOARD_MORE_IDEAS_TAB

        /* renamed from: a, reason: collision with root package name */
        public final Class f45105a = t.class;

        @Override // com.pinterest.feature.board.BoardFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        public final kl1.a getEarlyAccessKey() {
            return kl1.a.BoardMoreIdeasTabKey;
        }

        @Override // com.pinterest.feature.board.BoardFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45108a() {
            return this.f45105a;
        }
    };
    public static final BoardFeatureLocation BOARD_MORE_IDEAS_TOOL = new BoardFeatureLocation() { // from class: com.pinterest.feature.board.BoardFeatureLocation.BOARD_MORE_IDEAS_TOOL

        /* renamed from: a, reason: collision with root package name */
        public final Class f45106a = k.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f45107b = true;

        @Override // com.pinterest.feature.board.BoardFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45108a() {
            return this.f45106a;
        }

        @Override // com.pinterest.feature.board.BoardFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation, reason: from getter */
        public final boolean getF45109b() {
            return this.f45107b;
        }
    };
    public static final BoardFeatureLocation BOARD_MORE_IDEAS_BOTTOM_SHEET = new BoardFeatureLocation() { // from class: com.pinterest.feature.board.BoardFeatureLocation.BOARD_MORE_IDEAS_BOTTOM_SHEET

        /* renamed from: a, reason: collision with root package name */
        public final Class f45102a = h.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f45103b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f45104c = true;

        @Override // com.pinterest.feature.board.BoardFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45108a() {
            return this.f45102a;
        }

        @Override // com.pinterest.feature.board.BoardFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF45103b() {
            return this.f45103b;
        }

        @Override // com.pinterest.feature.board.BoardFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }

        @Override // com.pinterest.feature.board.BoardFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF45104c() {
            return this.f45104c;
        }
    };
    public static final BoardFeatureLocation BOARD_SECTION_MORE_IDEAS_TOOL = new BoardFeatureLocation() { // from class: com.pinterest.feature.board.BoardFeatureLocation.BOARD_SECTION_MORE_IDEAS_TOOL

        /* renamed from: a, reason: collision with root package name */
        public final Class f45108a = m.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f45109b = true;

        @Override // com.pinterest.feature.board.BoardFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45108a() {
            return this.f45108a;
        }

        @Override // com.pinterest.feature.board.BoardFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation, reason: from getter */
        public final boolean getF45109b() {
            return this.f45109b;
        }
    };
    public static final BoardFeatureLocation ABOUT_BOARD_RECOMMENDATIONS_MODAL = new BoardFeatureLocation() { // from class: com.pinterest.feature.board.BoardFeatureLocation.ABOUT_BOARD_RECOMMENDATIONS_MODAL

        /* renamed from: a, reason: collision with root package name */
        public final Class f45098a = vj0.b.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f45099b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f45100c = true;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f45101d = true;

        @Override // com.pinterest.feature.board.BoardFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45108a() {
            return this.f45098a;
        }

        @Override // com.pinterest.feature.board.BoardFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF45103b() {
            return this.f45099b;
        }

        @Override // com.pinterest.feature.board.BoardFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF45101d() {
            return this.f45101d;
        }

        @Override // com.pinterest.feature.board.BoardFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }

        @Override // com.pinterest.feature.board.BoardFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF45104c() {
            return this.f45100c;
        }
    };

    private static final /* synthetic */ BoardFeatureLocation[] $values() {
        return new BoardFeatureLocation[]{BOARD_MORE_IDEAS_TAB, BOARD_MORE_IDEAS_TOOL, BOARD_MORE_IDEAS_BOTTOM_SHEET, BOARD_SECTION_MORE_IDEAS_TOOL, ABOUT_BOARD_RECOMMENDATIONS_MODAL};
    }

    static {
        BoardFeatureLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
        CREATOR = new f1(23);
    }

    public /* synthetic */ BoardFeatureLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static BoardFeatureLocation valueOf(String str) {
        return (BoardFeatureLocation) Enum.valueOf(BoardFeatureLocation.class, str);
    }

    public static BoardFeatureLocation[] values() {
        return (BoardFeatureLocation[]) $VALUES.clone();
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
    public abstract /* synthetic */ Class getF45108a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF45103b() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF45101d() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF45109b() {
        return super.getF45109b();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF45104c() {
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

    private BoardFeatureLocation(String str, int i13) {
    }
}
