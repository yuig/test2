package com.pinterest.feature.board.detail;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cj0.p;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.g;
import jm0.j;
import kl0.f0;
import kl0.z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import nx.f1;
import org.jetbrains.annotations.NotNull;
import qm0.p0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/pinterest/feature/board/detail/BoardDetailFeatureLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/feature/board/detail/e", "BOARD", "BOARD_LANDING", "AUTOMAGICAL_BOARD", "BOARD_ALL_SAVES", "BOARD_VIEW_TYPE_MODAL", "detail_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class BoardDetailFeatureLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ BoardDetailFeatureLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<BoardDetailFeatureLocation> CREATOR;

    @NotNull
    public static final e Companion;
    public static final BoardDetailFeatureLocation BOARD = new BoardDetailFeatureLocation() { // from class: com.pinterest.feature.board.detail.BoardDetailFeatureLocation.BOARD

        /* renamed from: a, reason: collision with root package name */
        public final Class f45166a = z.class;

        @Override // com.pinterest.feature.board.detail.BoardDetailFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45169a() {
            return this.f45166a;
        }

        @Override // com.pinterest.feature.board.detail.BoardDetailFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final BoardDetailFeatureLocation BOARD_LANDING = new BoardDetailFeatureLocation() { // from class: com.pinterest.feature.board.detail.BoardDetailFeatureLocation.BOARD_LANDING

        /* renamed from: a, reason: collision with root package name */
        public final Class f45168a = p0.class;

        @Override // com.pinterest.feature.board.detail.BoardDetailFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45169a() {
            return this.f45168a;
        }

        @Override // com.pinterest.feature.board.detail.BoardDetailFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final BoardDetailFeatureLocation AUTOMAGICAL_BOARD = new BoardDetailFeatureLocation() { // from class: com.pinterest.feature.board.detail.BoardDetailFeatureLocation.AUTOMAGICAL_BOARD

        /* renamed from: a, reason: collision with root package name */
        public final Class f45165a = p.class;

        @Override // com.pinterest.feature.board.detail.BoardDetailFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45169a() {
            return this.f45165a;
        }

        @Override // com.pinterest.feature.board.detail.BoardDetailFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final BoardDetailFeatureLocation BOARD_ALL_SAVES = new BoardDetailFeatureLocation() { // from class: com.pinterest.feature.board.detail.BoardDetailFeatureLocation.BOARD_ALL_SAVES

        /* renamed from: a, reason: collision with root package name */
        public final Class f45167a = j.class;

        @Override // com.pinterest.feature.board.detail.BoardDetailFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45169a() {
            return this.f45167a;
        }

        @Override // com.pinterest.feature.board.detail.BoardDetailFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final BoardDetailFeatureLocation BOARD_VIEW_TYPE_MODAL = new BoardDetailFeatureLocation() { // from class: com.pinterest.feature.board.detail.BoardDetailFeatureLocation.BOARD_VIEW_TYPE_MODAL

        /* renamed from: a, reason: collision with root package name */
        public final Class f45169a = f0.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f45170b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f45171c = true;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f45172d = true;

        @Override // com.pinterest.feature.board.detail.BoardDetailFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45169a() {
            return this.f45169a;
        }

        @Override // com.pinterest.feature.board.detail.BoardDetailFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF45170b() {
            return this.f45170b;
        }

        @Override // com.pinterest.feature.board.detail.BoardDetailFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF45172d() {
            return this.f45172d;
        }

        @Override // com.pinterest.feature.board.detail.BoardDetailFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }

        @Override // com.pinterest.feature.board.detail.BoardDetailFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF45171c() {
            return this.f45171c;
        }
    };

    private static final /* synthetic */ BoardDetailFeatureLocation[] $values() {
        return new BoardDetailFeatureLocation[]{BOARD, BOARD_LANDING, AUTOMAGICAL_BOARD, BOARD_ALL_SAVES, BOARD_VIEW_TYPE_MODAL};
    }

    static {
        BoardDetailFeatureLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new e();
        CREATOR = new f1(26);
    }

    public /* synthetic */ BoardDetailFeatureLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static BoardDetailFeatureLocation valueOf(String str) {
        return (BoardDetailFeatureLocation) Enum.valueOf(BoardDetailFeatureLocation.class, str);
    }

    public static BoardDetailFeatureLocation[] values() {
        return (BoardDetailFeatureLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public g getF48461b() {
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
    public abstract /* synthetic */ Class getF45169a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF45170b() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF45172d() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF46867b() {
        return super.getF46867b();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF45171c() {
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

    private BoardDetailFeatureLocation(String str, int i13) {
    }
}
