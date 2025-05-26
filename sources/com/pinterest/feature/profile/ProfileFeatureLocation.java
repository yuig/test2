package com.pinterest.feature.profile;

import a41.r;
import a51.d;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import b31.g;
import com.pinterest.framework.screens.ScreenLocation;
import g41.c;
import g41.m;
import g41.p;
import i2.u1;
import j51.d0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import m31.e;
import org.jetbrains.annotations.NotNull;
import u31.f;
import w41.n0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, d2 = {"Lcom/pinterest/feature/profile/ProfileFeatureLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/feature/profile/a", "USER", "ALL_PINS", "PROFILE_PINS", "PROFILE_UNORGANIZED_PINS_BOARD_CREATE", "RECENTLY_ACTIONED_PIN_FEED", "PROFILE_CREATED_PINS", "ORGANIZE_PROFILE_PINS", "PROFILE_FOLLOWERS", "PROFILE_FOLLOWING", "PROFILE_FOLLOWED_USERS", "PROFILE_FOLLOWED_BOARDS", "SAVED", "PROFILE_REPORT_SPAM", "ABOUT_DRAWER", "SOFT_DELETED_BOARD_RESTORATION", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class ProfileFeatureLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ ProfileFeatureLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<ProfileFeatureLocation> CREATOR;

    @NotNull
    public static final a Companion;
    public static final ProfileFeatureLocation USER = new ProfileFeatureLocation() { // from class: com.pinterest.feature.profile.ProfileFeatureLocation.USER

        /* renamed from: a, reason: collision with root package name */
        public final Class f47474a = r.class;

        @Override // com.pinterest.feature.profile.ProfileFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        public final kl1.a getEarlyAccessKey() {
            return kl1.a.UserProfileKey;
        }

        @Override // com.pinterest.feature.profile.ProfileFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF47474a() {
            return this.f47474a;
        }
    };
    public static final ProfileFeatureLocation ALL_PINS = new ALL_PINS("ALL_PINS", 1, null);
    public static final ProfileFeatureLocation PROFILE_PINS = new ProfileFeatureLocation() { // from class: com.pinterest.feature.profile.ProfileFeatureLocation.PROFILE_PINS

        /* renamed from: a, reason: collision with root package name */
        public final Class f47468a = n0.class;

        @Override // com.pinterest.feature.profile.ProfileFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF47474a() {
            return this.f47468a;
        }
    };
    public static final ProfileFeatureLocation PROFILE_UNORGANIZED_PINS_BOARD_CREATE = new ProfileFeatureLocation() { // from class: com.pinterest.feature.profile.ProfileFeatureLocation.PROFILE_UNORGANIZED_PINS_BOARD_CREATE

        /* renamed from: a, reason: collision with root package name */
        public final Class f47470a = e.class;

        @Override // com.pinterest.feature.profile.ProfileFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF47474a() {
            return this.f47470a;
        }

        @Override // com.pinterest.feature.profile.ProfileFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF47467b() {
            return false;
        }
    };
    public static final ProfileFeatureLocation RECENTLY_ACTIONED_PIN_FEED = new ProfileFeatureLocation() { // from class: com.pinterest.feature.profile.ProfileFeatureLocation.RECENTLY_ACTIONED_PIN_FEED

        /* renamed from: a, reason: collision with root package name */
        public final Class f47471a = d.class;

        @Override // com.pinterest.feature.profile.ProfileFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF47474a() {
            return this.f47471a;
        }
    };
    public static final ProfileFeatureLocation PROFILE_CREATED_PINS = new ProfileFeatureLocation() { // from class: com.pinterest.feature.profile.ProfileFeatureLocation.PROFILE_CREATED_PINS

        /* renamed from: a, reason: collision with root package name */
        public final Class f47462a = f.class;

        @Override // com.pinterest.feature.profile.ProfileFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF47474a() {
            return this.f47462a;
        }
    };
    public static final ProfileFeatureLocation ORGANIZE_PROFILE_PINS = new ProfileFeatureLocation() { // from class: com.pinterest.feature.profile.ProfileFeatureLocation.ORGANIZE_PROFILE_PINS

        /* renamed from: a, reason: collision with root package name */
        public final Class f47461a = s41.f.class;

        @Override // com.pinterest.feature.profile.ProfileFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF47474a() {
            return this.f47461a;
        }
    };
    public static final ProfileFeatureLocation PROFILE_FOLLOWERS = new ProfileFeatureLocation() { // from class: com.pinterest.feature.profile.ProfileFeatureLocation.PROFILE_FOLLOWERS

        /* renamed from: a, reason: collision with root package name */
        public final Class f47465a = m.class;

        @Override // com.pinterest.feature.profile.ProfileFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF47474a() {
            return this.f47465a;
        }
    };
    public static final ProfileFeatureLocation PROFILE_FOLLOWING = new ProfileFeatureLocation() { // from class: com.pinterest.feature.profile.ProfileFeatureLocation.PROFILE_FOLLOWING

        /* renamed from: a, reason: collision with root package name */
        public final Class f47466a = p.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f47467b = true;

        @Override // com.pinterest.feature.profile.ProfileFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF47474a() {
            return this.f47466a;
        }

        @Override // com.pinterest.feature.profile.ProfileFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation, reason: from getter */
        public final boolean getF47467b() {
            return this.f47467b;
        }
    };
    public static final ProfileFeatureLocation PROFILE_FOLLOWED_USERS = new ProfileFeatureLocation() { // from class: com.pinterest.feature.profile.ProfileFeatureLocation.PROFILE_FOLLOWED_USERS

        /* renamed from: a, reason: collision with root package name */
        public final Class f47464a = g41.e.class;

        @Override // com.pinterest.feature.profile.ProfileFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF47474a() {
            return this.f47464a;
        }
    };
    public static final ProfileFeatureLocation PROFILE_FOLLOWED_BOARDS = new ProfileFeatureLocation() { // from class: com.pinterest.feature.profile.ProfileFeatureLocation.PROFILE_FOLLOWED_BOARDS

        /* renamed from: a, reason: collision with root package name */
        public final Class f47463a = c.class;

        @Override // com.pinterest.feature.profile.ProfileFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF47474a() {
            return this.f47463a;
        }
    };
    public static final ProfileFeatureLocation SAVED = new ProfileFeatureLocation() { // from class: com.pinterest.feature.profile.ProfileFeatureLocation.SAVED

        /* renamed from: a, reason: collision with root package name */
        public final Class f47472a = d0.class;

        @Override // com.pinterest.feature.profile.ProfileFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF47474a() {
            return this.f47472a;
        }
    };
    public static final ProfileFeatureLocation PROFILE_REPORT_SPAM = new ProfileFeatureLocation() { // from class: com.pinterest.feature.profile.ProfileFeatureLocation.PROFILE_REPORT_SPAM

        /* renamed from: a, reason: collision with root package name */
        public final Class f47469a = b51.e.class;

        @Override // com.pinterest.feature.profile.ProfileFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF47474a() {
            return this.f47469a;
        }
    };
    public static final ProfileFeatureLocation ABOUT_DRAWER = new ProfileFeatureLocation() { // from class: com.pinterest.feature.profile.ProfileFeatureLocation.ABOUT_DRAWER

        /* renamed from: a, reason: collision with root package name */
        public final Class f47456a = g.class;

        /* renamed from: b, reason: collision with root package name */
        public final com.pinterest.framework.screens.g f47457b = com.pinterest.framework.screens.g.MODAL;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f47458c = true;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f47459d = true;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f47460e = true;

        @Override // com.pinterest.feature.profile.ProfileFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final com.pinterest.framework.screens.g getF47457b() {
            return this.f47457b;
        }

        @Override // com.pinterest.feature.profile.ProfileFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF47474a() {
            return this.f47456a;
        }

        @Override // com.pinterest.feature.profile.ProfileFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF47459d() {
            return this.f47459d;
        }

        @Override // com.pinterest.feature.profile.ProfileFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF47460e() {
            return this.f47460e;
        }

        @Override // com.pinterest.feature.profile.ProfileFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF47467b() {
            return false;
        }

        @Override // com.pinterest.feature.profile.ProfileFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF47458c() {
            return this.f47458c;
        }
    };
    public static final ProfileFeatureLocation SOFT_DELETED_BOARD_RESTORATION = new ProfileFeatureLocation() { // from class: com.pinterest.feature.profile.ProfileFeatureLocation.SOFT_DELETED_BOARD_RESTORATION

        /* renamed from: a, reason: collision with root package name */
        public final Class f47473a = j51.e.class;

        @Override // com.pinterest.feature.profile.ProfileFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF47474a() {
            return this.f47473a;
        }
    };

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/feature/profile/ProfileFeatureLocation$ALL_PINS;", "Lcom/pinterest/feature/profile/ProfileFeatureLocation;", "profile_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class ALL_PINS extends ProfileFeatureLocation {
        @Override // com.pinterest.feature.profile.ProfileFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass */
        public final Class getF47474a() {
            return c31.r.class;
        }
    }

    private static final /* synthetic */ ProfileFeatureLocation[] $values() {
        return new ProfileFeatureLocation[]{USER, ALL_PINS, PROFILE_PINS, PROFILE_UNORGANIZED_PINS_BOARD_CREATE, RECENTLY_ACTIONED_PIN_FEED, PROFILE_CREATED_PINS, ORGANIZE_PROFILE_PINS, PROFILE_FOLLOWERS, PROFILE_FOLLOWING, PROFILE_FOLLOWED_USERS, PROFILE_FOLLOWED_BOARDS, SAVED, PROFILE_REPORT_SPAM, ABOUT_DRAWER, SOFT_DELETED_BOARD_RESTORATION};
    }

    static {
        ProfileFeatureLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
        CREATOR = new u1(25);
    }

    public /* synthetic */ ProfileFeatureLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static ProfileFeatureLocation valueOf(String str) {
        return (ProfileFeatureLocation) Enum.valueOf(ProfileFeatureLocation.class, str);
    }

    public static ProfileFeatureLocation[] values() {
        return (ProfileFeatureLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public com.pinterest.framework.screens.g getF47457b() {
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
    public abstract /* synthetic */ Class getF47474a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF47459d() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF47460e() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF47467b() {
        return super.getF47467b();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF47458c() {
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

    private ProfileFeatureLocation(String str, int i13) {
    }
}
