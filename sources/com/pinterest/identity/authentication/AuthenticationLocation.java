package com.pinterest.identity.authentication;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.g;
import i2.u1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import org.jetbrains.annotations.NotNull;
import wq1.f;
import yq1.b1;
import yq1.k;
import yq1.q;
import yq1.s2;
import yq1.u;
import yq1.u0;
import yq1.y0;
import yq1.y1;
import yq1.z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/pinterest/identity/authentication/AuthenticationLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/identity/authentication/b", "UNAUTH_LOADING_SCREEN", "UNAUTH_LANDING_SCREEN", "UNAUTH_LOGIN_SCREEN", "UNAUTH_LOGIN_WITH_EXISTING_EMAIL_SCREEN", "UNAUTH_CREATE_PASSWORD_SCREEN", "UNAUTH_SIGNUP_STEP_SCREEN", "UNAUTH_EMAIL_COLLECTION", "BUSINESS_ACCOUNT_CREATE", "UNAUTH_PENDING_SIGNUP_SCREEN", "UNAUTH_MFA_LOGIN_SCREEN", "identity_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class AuthenticationLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ AuthenticationLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<AuthenticationLocation> CREATOR;

    @NotNull
    public static final b Companion;
    public static final AuthenticationLocation UNAUTH_LOADING_SCREEN = new AuthenticationLocation() { // from class: com.pinterest.identity.authentication.AuthenticationLocation.UNAUTH_LOADING_SCREEN

        /* renamed from: a, reason: collision with root package name */
        public final Class f49809a = q.class;

        @Override // com.pinterest.identity.authentication.AuthenticationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45169a() {
            return this.f49809a;
        }
    };
    public static final AuthenticationLocation UNAUTH_LANDING_SCREEN = new AuthenticationLocation() { // from class: com.pinterest.identity.authentication.AuthenticationLocation.UNAUTH_LANDING_SCREEN

        /* renamed from: a, reason: collision with root package name */
        public final Class f49808a = k.class;

        @Override // com.pinterest.identity.authentication.AuthenticationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45521a() {
            return this.f49808a;
        }
    };
    public static final AuthenticationLocation UNAUTH_LOGIN_SCREEN = new AuthenticationLocation() { // from class: com.pinterest.identity.authentication.AuthenticationLocation.UNAUTH_LOGIN_SCREEN

        /* renamed from: a, reason: collision with root package name */
        public final Class f49810a = s2.class;

        /* renamed from: b, reason: collision with root package name */
        public final g f49811b = g.MODAL;

        @Override // com.pinterest.identity.authentication.AuthenticationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF45517b() {
            return this.f49811b;
        }

        @Override // com.pinterest.identity.authentication.AuthenticationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45521a() {
            return this.f49810a;
        }
    };
    public static final AuthenticationLocation UNAUTH_LOGIN_WITH_EXISTING_EMAIL_SCREEN = new AuthenticationLocation() { // from class: com.pinterest.identity.authentication.AuthenticationLocation.UNAUTH_LOGIN_WITH_EXISTING_EMAIL_SCREEN

        /* renamed from: a, reason: collision with root package name */
        public final Class f49812a = u0.class;

        @Override // com.pinterest.identity.authentication.AuthenticationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45521a() {
            return this.f49812a;
        }
    };
    public static final AuthenticationLocation UNAUTH_CREATE_PASSWORD_SCREEN = new AuthenticationLocation() { // from class: com.pinterest.identity.authentication.AuthenticationLocation.UNAUTH_CREATE_PASSWORD_SCREEN

        /* renamed from: a, reason: collision with root package name */
        public final Class f49806a = u.class;

        @Override // com.pinterest.identity.authentication.AuthenticationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45521a() {
            return this.f49806a;
        }
    };
    public static final AuthenticationLocation UNAUTH_SIGNUP_STEP_SCREEN = new AuthenticationLocation() { // from class: com.pinterest.identity.authentication.AuthenticationLocation.UNAUTH_SIGNUP_STEP_SCREEN

        /* renamed from: a, reason: collision with root package name */
        public final Class f49815a = y1.class;

        @Override // com.pinterest.identity.authentication.AuthenticationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45521a() {
            return this.f49815a;
        }

        @Override // com.pinterest.identity.authentication.AuthenticationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final AuthenticationLocation UNAUTH_EMAIL_COLLECTION = new AuthenticationLocation() { // from class: com.pinterest.identity.authentication.AuthenticationLocation.UNAUTH_EMAIL_COLLECTION

        /* renamed from: a, reason: collision with root package name */
        public final Class f49807a = z.class;

        @Override // com.pinterest.identity.authentication.AuthenticationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45521a() {
            return this.f49807a;
        }
    };
    public static final AuthenticationLocation BUSINESS_ACCOUNT_CREATE = new AuthenticationLocation() { // from class: com.pinterest.identity.authentication.AuthenticationLocation.BUSINESS_ACCOUNT_CREATE

        /* renamed from: a, reason: collision with root package name */
        public final Class f49805a = f.class;

        @Override // com.pinterest.identity.authentication.AuthenticationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45521a() {
            return this.f49805a;
        }

        @Override // com.pinterest.identity.authentication.AuthenticationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final AuthenticationLocation UNAUTH_PENDING_SIGNUP_SCREEN = new AuthenticationLocation() { // from class: com.pinterest.identity.authentication.AuthenticationLocation.UNAUTH_PENDING_SIGNUP_SCREEN

        /* renamed from: a, reason: collision with root package name */
        public final Class f49814a = b1.class;

        @Override // com.pinterest.identity.authentication.AuthenticationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45521a() {
            return this.f49814a;
        }
    };
    public static final AuthenticationLocation UNAUTH_MFA_LOGIN_SCREEN = new AuthenticationLocation() { // from class: com.pinterest.identity.authentication.AuthenticationLocation.UNAUTH_MFA_LOGIN_SCREEN

        /* renamed from: a, reason: collision with root package name */
        public final Class f49813a = y0.class;

        @Override // com.pinterest.identity.authentication.AuthenticationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45521a() {
            return this.f49813a;
        }
    };

    private static final /* synthetic */ AuthenticationLocation[] $values() {
        return new AuthenticationLocation[]{UNAUTH_LOADING_SCREEN, UNAUTH_LANDING_SCREEN, UNAUTH_LOGIN_SCREEN, UNAUTH_LOGIN_WITH_EXISTING_EMAIL_SCREEN, UNAUTH_CREATE_PASSWORD_SCREEN, UNAUTH_SIGNUP_STEP_SCREEN, UNAUTH_EMAIL_COLLECTION, BUSINESS_ACCOUNT_CREATE, UNAUTH_PENDING_SIGNUP_SCREEN, UNAUTH_MFA_LOGIN_SCREEN};
    }

    static {
        AuthenticationLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new b();
        CREATOR = new u1(27);
    }

    public /* synthetic */ AuthenticationLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static AuthenticationLocation valueOf(String str) {
        return (AuthenticationLocation) Enum.valueOf(AuthenticationLocation.class, str);
    }

    public static AuthenticationLocation[] values() {
        return (AuthenticationLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public g getF45517b() {
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
    public abstract /* synthetic */ Class getF45521a();

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

    private AuthenticationLocation(String str, int i13) {
    }
}
