package com.pinterest.feature.didit.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.pinterest.feature.board.permissions.b;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import org.jetbrains.annotations.NotNull;
import u51.e;
import u51.i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/pinterest/feature/didit/model/DidItFeatureLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/feature/didit/model/a", "AGGREGATED_COMMENT_REPORT_REASON", "AGGREGATED_COMMENT_REPORT_REASONS", "AGGREGATED_COMMENT_REPORT_SECONDARY_REASONS", "COMMUNITY_REACTION_LIKE_LIST", "USER_LIKES_LIST", "didit_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class DidItFeatureLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ DidItFeatureLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<DidItFeatureLocation> CREATOR;

    @NotNull
    public static final a Companion;
    public static final DidItFeatureLocation AGGREGATED_COMMENT_REPORT_REASON = new DidItFeatureLocation() { // from class: com.pinterest.feature.didit.model.DidItFeatureLocation.AGGREGATED_COMMENT_REPORT_REASON

        /* renamed from: a, reason: collision with root package name */
        public final Class f45663a = e.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f45664b = true;

        @Override // com.pinterest.feature.didit.model.DidItFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45671a() {
            return this.f45663a;
        }

        @Override // com.pinterest.feature.didit.model.DidItFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF45669b() {
            return this.f45664b;
        }

        @Override // com.pinterest.feature.didit.model.DidItFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final DidItFeatureLocation AGGREGATED_COMMENT_REPORT_REASONS = new DidItFeatureLocation() { // from class: com.pinterest.feature.didit.model.DidItFeatureLocation.AGGREGATED_COMMENT_REPORT_REASONS

        /* renamed from: a, reason: collision with root package name */
        public final Class f45665a = i.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f45666b = true;

        /* renamed from: c, reason: collision with root package name */
        public final g f45667c = g.MODAL;

        @Override // com.pinterest.feature.didit.model.DidItFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF45667c() {
            return this.f45667c;
        }

        @Override // com.pinterest.feature.didit.model.DidItFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45671a() {
            return this.f45665a;
        }

        @Override // com.pinterest.feature.didit.model.DidItFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF45669b() {
            return this.f45666b;
        }

        @Override // com.pinterest.feature.didit.model.DidItFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final DidItFeatureLocation AGGREGATED_COMMENT_REPORT_SECONDARY_REASONS = new DidItFeatureLocation() { // from class: com.pinterest.feature.didit.model.DidItFeatureLocation.AGGREGATED_COMMENT_REPORT_SECONDARY_REASONS

        /* renamed from: a, reason: collision with root package name */
        public final Class f45668a = i.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f45669b = true;

        @Override // com.pinterest.feature.didit.model.DidItFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45671a() {
            return this.f45668a;
        }

        @Override // com.pinterest.feature.didit.model.DidItFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF45669b() {
            return this.f45669b;
        }

        @Override // com.pinterest.feature.didit.model.DidItFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final DidItFeatureLocation COMMUNITY_REACTION_LIKE_LIST = new DidItFeatureLocation() { // from class: com.pinterest.feature.didit.model.DidItFeatureLocation.COMMUNITY_REACTION_LIKE_LIST

        /* renamed from: a, reason: collision with root package name */
        public final Class f45670a = mr0.e.class;

        @Override // com.pinterest.feature.didit.model.DidItFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45671a() {
            return this.f45670a;
        }

        @Override // com.pinterest.feature.didit.model.DidItFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final DidItFeatureLocation USER_LIKES_LIST = new DidItFeatureLocation() { // from class: com.pinterest.feature.didit.model.DidItFeatureLocation.USER_LIKES_LIST

        /* renamed from: a, reason: collision with root package name */
        public final Class f45671a = mr0.e.class;

        @Override // com.pinterest.feature.didit.model.DidItFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45671a() {
            return this.f45671a;
        }

        @Override // com.pinterest.feature.didit.model.DidItFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };

    private static final /* synthetic */ DidItFeatureLocation[] $values() {
        return new DidItFeatureLocation[]{AGGREGATED_COMMENT_REPORT_REASON, AGGREGATED_COMMENT_REPORT_REASONS, AGGREGATED_COMMENT_REPORT_SECONDARY_REASONS, COMMUNITY_REACTION_LIKE_LIST, USER_LIKES_LIST};
    }

    static {
        DidItFeatureLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
        CREATOR = new b(7);
    }

    public /* synthetic */ DidItFeatureLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static DidItFeatureLocation valueOf(String str) {
        return (DidItFeatureLocation) Enum.valueOf(DidItFeatureLocation.class, str);
    }

    public static DidItFeatureLocation[] values() {
        return (DidItFeatureLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public g getF45667c() {
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
    public abstract /* synthetic */ Class getF45671a();

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

    private DidItFeatureLocation(String str, int i13) {
    }
}
