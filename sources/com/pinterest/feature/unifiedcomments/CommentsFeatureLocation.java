package com.pinterest.feature.unifiedcomments;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.pinterest.framework.screens.ScreenLocation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import org.jetbrains.annotations.NotNull;
import rh1.b0;
import rh1.e2;
import rh1.h2;
import rh1.q0;
import rh1.v1;
import rh1.x1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/pinterest/feature/unifiedcomments/CommentsFeatureLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/feature/unifiedcomments/e", "NEW_COMMENT_HALF_SHEET", "COMMENTS_MODAL", "UNIFIED_COMMENTS", "NUDGE_COMMENTS_PUSH_NOTIFICATION", "COMMENT_STICKERS", "COMMENT_PHOTO_VIEWER", "comments_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class CommentsFeatureLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ CommentsFeatureLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<CommentsFeatureLocation> CREATOR;

    @NotNull
    public static final e Companion;
    public static final CommentsFeatureLocation NEW_COMMENT_HALF_SHEET = new CommentsFeatureLocation() { // from class: com.pinterest.feature.unifiedcomments.CommentsFeatureLocation.NEW_COMMENT_HALF_SHEET

        /* renamed from: a, reason: collision with root package name */
        public final Class f48899a = v1.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f48900b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f48901c = true;

        @Override // com.pinterest.feature.unifiedcomments.CommentsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48906a() {
            return this.f48899a;
        }

        @Override // com.pinterest.feature.unifiedcomments.CommentsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF48903b() {
            return this.f48900b;
        }

        @Override // com.pinterest.feature.unifiedcomments.CommentsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF48905d() {
            return this.f48901c;
        }

        @Override // com.pinterest.feature.unifiedcomments.CommentsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final CommentsFeatureLocation COMMENTS_MODAL = new CommentsFeatureLocation() { // from class: com.pinterest.feature.unifiedcomments.CommentsFeatureLocation.COMMENTS_MODAL

        /* renamed from: a, reason: collision with root package name */
        public final Class f48889a = q0.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f48890b = true;

        /* renamed from: c, reason: collision with root package name */
        public final com.pinterest.framework.screens.g f48891c = com.pinterest.framework.screens.g.MODAL;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f48892d = true;

        @Override // com.pinterest.feature.unifiedcomments.CommentsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final com.pinterest.framework.screens.g getF48904c() {
            return this.f48891c;
        }

        @Override // com.pinterest.feature.unifiedcomments.CommentsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48906a() {
            return this.f48889a;
        }

        @Override // com.pinterest.feature.unifiedcomments.CommentsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF48903b() {
            return this.f48890b;
        }

        @Override // com.pinterest.feature.unifiedcomments.CommentsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF48905d() {
            return this.f48892d;
        }

        @Override // com.pinterest.feature.unifiedcomments.CommentsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final CommentsFeatureLocation UNIFIED_COMMENTS = new CommentsFeatureLocation() { // from class: com.pinterest.feature.unifiedcomments.CommentsFeatureLocation.UNIFIED_COMMENTS

        /* renamed from: a, reason: collision with root package name */
        public final Class f48906a = h2.class;

        @Override // com.pinterest.feature.unifiedcomments.CommentsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48906a() {
            return this.f48906a;
        }

        @Override // com.pinterest.feature.unifiedcomments.CommentsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final CommentsFeatureLocation NUDGE_COMMENTS_PUSH_NOTIFICATION = new CommentsFeatureLocation() { // from class: com.pinterest.feature.unifiedcomments.CommentsFeatureLocation.NUDGE_COMMENTS_PUSH_NOTIFICATION

        /* renamed from: a, reason: collision with root package name */
        public final Class f48902a = e2.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f48903b = true;

        /* renamed from: c, reason: collision with root package name */
        public final com.pinterest.framework.screens.g f48904c = com.pinterest.framework.screens.g.MODAL;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f48905d = true;

        @Override // com.pinterest.feature.unifiedcomments.CommentsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final com.pinterest.framework.screens.g getF48904c() {
            return this.f48904c;
        }

        @Override // com.pinterest.feature.unifiedcomments.CommentsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48906a() {
            return this.f48902a;
        }

        @Override // com.pinterest.feature.unifiedcomments.CommentsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF48903b() {
            return this.f48903b;
        }

        @Override // com.pinterest.feature.unifiedcomments.CommentsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF48905d() {
            return this.f48905d;
        }

        @Override // com.pinterest.feature.unifiedcomments.CommentsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final CommentsFeatureLocation COMMENT_STICKERS = new CommentsFeatureLocation() { // from class: com.pinterest.feature.unifiedcomments.CommentsFeatureLocation.COMMENT_STICKERS

        /* renamed from: a, reason: collision with root package name */
        public final Class f48896a = b0.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f48897b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f48898c = true;

        @Override // com.pinterest.feature.unifiedcomments.CommentsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48906a() {
            return this.f48896a;
        }

        @Override // com.pinterest.feature.unifiedcomments.CommentsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF48903b() {
            return this.f48897b;
        }

        @Override // com.pinterest.feature.unifiedcomments.CommentsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }

        @Override // com.pinterest.feature.unifiedcomments.CommentsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF48898c() {
            return this.f48898c;
        }
    };
    public static final CommentsFeatureLocation COMMENT_PHOTO_VIEWER = new CommentsFeatureLocation() { // from class: com.pinterest.feature.unifiedcomments.CommentsFeatureLocation.COMMENT_PHOTO_VIEWER

        /* renamed from: a, reason: collision with root package name */
        public final Class f48893a = x1.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f48894b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f48895c = true;

        @Override // com.pinterest.feature.unifiedcomments.CommentsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48906a() {
            return this.f48893a;
        }

        @Override // com.pinterest.feature.unifiedcomments.CommentsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF48903b() {
            return this.f48894b;
        }

        @Override // com.pinterest.feature.unifiedcomments.CommentsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }

        @Override // com.pinterest.feature.unifiedcomments.CommentsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF48898c() {
            return this.f48895c;
        }
    };

    private static final /* synthetic */ CommentsFeatureLocation[] $values() {
        return new CommentsFeatureLocation[]{NEW_COMMENT_HALF_SHEET, COMMENTS_MODAL, UNIFIED_COMMENTS, NUDGE_COMMENTS_PUSH_NOTIFICATION, COMMENT_STICKERS, COMMENT_PHOTO_VIEWER};
    }

    static {
        CommentsFeatureLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new e();
        CREATOR = new com.pinterest.feature.todaytab.a(2);
    }

    public /* synthetic */ CommentsFeatureLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static CommentsFeatureLocation valueOf(String str) {
        return (CommentsFeatureLocation) Enum.valueOf(CommentsFeatureLocation.class, str);
    }

    public static CommentsFeatureLocation[] values() {
        return (CommentsFeatureLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public com.pinterest.framework.screens.g getF48904c() {
        return com.pinterest.framework.screens.g.DEFAULT;
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
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF48903b() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF48905d() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF46867b() {
        return super.getF46867b();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF48898c() {
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

    private CommentsFeatureLocation(String str, int i13) {
    }
}
