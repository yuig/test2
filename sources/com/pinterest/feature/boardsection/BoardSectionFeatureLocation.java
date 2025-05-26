package com.pinterest.feature.boardsection;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import org.jetbrains.annotations.NotNull;
import qn0.d;
import rn0.e;
import wn0.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/pinterest/feature/boardsection/BoardSectionFeatureLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/feature/boardsection/b", "CREATE_BOARD_SECTION_SELECT_PINS", "BOARD_SECTION_EDIT", "BOARD_SECTION_CREATE", "BOARD_SECTION_MERGE_SECTION_PICKER", "BOARD_SECTION", "boardSection_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class BoardSectionFeatureLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ BoardSectionFeatureLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<BoardSectionFeatureLocation> CREATOR;

    @NotNull
    public static final b Companion;
    public static final BoardSectionFeatureLocation CREATE_BOARD_SECTION_SELECT_PINS = new BoardSectionFeatureLocation() { // from class: com.pinterest.feature.boardsection.BoardSectionFeatureLocation.CREATE_BOARD_SECTION_SELECT_PINS

        /* renamed from: a, reason: collision with root package name */
        public final Class f45358a = d.class;

        /* renamed from: b, reason: collision with root package name */
        public final g f45359b = g.MODAL;

        @Override // com.pinterest.feature.boardsection.BoardSectionFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF45359b() {
            return this.f45359b;
        }

        @Override // com.pinterest.feature.boardsection.BoardSectionFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45358a() {
            return this.f45358a;
        }
    };
    public static final BoardSectionFeatureLocation BOARD_SECTION_EDIT = new BoardSectionFeatureLocation() { // from class: com.pinterest.feature.boardsection.BoardSectionFeatureLocation.BOARD_SECTION_EDIT

        /* renamed from: a, reason: collision with root package name */
        public final Class f45354a = zn0.d.class;

        /* renamed from: b, reason: collision with root package name */
        public final g f45355b = g.MODAL;

        @Override // com.pinterest.feature.boardsection.BoardSectionFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF45359b() {
            return this.f45355b;
        }

        @Override // com.pinterest.feature.boardsection.BoardSectionFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45358a() {
            return this.f45354a;
        }

        @Override // com.pinterest.feature.boardsection.BoardSectionFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final BoardSectionFeatureLocation BOARD_SECTION_CREATE = new BoardSectionFeatureLocation() { // from class: com.pinterest.feature.boardsection.BoardSectionFeatureLocation.BOARD_SECTION_CREATE

        /* renamed from: a, reason: collision with root package name */
        public final Class f45352a = e.class;

        /* renamed from: b, reason: collision with root package name */
        public final g f45353b = g.MODAL;

        @Override // com.pinterest.feature.boardsection.BoardSectionFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF45359b() {
            return this.f45353b;
        }

        @Override // com.pinterest.feature.boardsection.BoardSectionFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45358a() {
            return this.f45352a;
        }

        @Override // com.pinterest.feature.boardsection.BoardSectionFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final BoardSectionFeatureLocation BOARD_SECTION_MERGE_SECTION_PICKER = new BoardSectionFeatureLocation() { // from class: com.pinterest.feature.boardsection.BoardSectionFeatureLocation.BOARD_SECTION_MERGE_SECTION_PICKER

        /* renamed from: a, reason: collision with root package name */
        public final Class f45356a = do0.b.class;

        /* renamed from: b, reason: collision with root package name */
        public final g f45357b = g.MODAL;

        @Override // com.pinterest.feature.boardsection.BoardSectionFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF45359b() {
            return this.f45357b;
        }

        @Override // com.pinterest.feature.boardsection.BoardSectionFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45358a() {
            return this.f45356a;
        }

        @Override // com.pinterest.feature.boardsection.BoardSectionFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final BoardSectionFeatureLocation BOARD_SECTION = new BoardSectionFeatureLocation() { // from class: com.pinterest.feature.boardsection.BoardSectionFeatureLocation.BOARD_SECTION

        /* renamed from: a, reason: collision with root package name */
        public final Class f45351a = j.class;

        @Override // com.pinterest.feature.boardsection.BoardSectionFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45358a() {
            return this.f45351a;
        }

        @Override // com.pinterest.feature.boardsection.BoardSectionFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };

    private static final /* synthetic */ BoardSectionFeatureLocation[] $values() {
        return new BoardSectionFeatureLocation[]{CREATE_BOARD_SECTION_SELECT_PINS, BOARD_SECTION_EDIT, BOARD_SECTION_CREATE, BOARD_SECTION_MERGE_SECTION_PICKER, BOARD_SECTION};
    }

    static {
        BoardSectionFeatureLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new b();
        CREATOR = new com.pinterest.feature.board.permissions.b(1);
    }

    public /* synthetic */ BoardSectionFeatureLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static BoardSectionFeatureLocation valueOf(String str) {
        return (BoardSectionFeatureLocation) Enum.valueOf(BoardSectionFeatureLocation.class, str);
    }

    public static BoardSectionFeatureLocation[] values() {
        return (BoardSectionFeatureLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public g getF45359b() {
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
    public abstract /* synthetic */ Class getF45358a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF35551c() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF35552d() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF45109b() {
        return super.getF45109b();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF35550b() {
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

    private BoardSectionFeatureLocation(String str, int i13) {
    }
}
