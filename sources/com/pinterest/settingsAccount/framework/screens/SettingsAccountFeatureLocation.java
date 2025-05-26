package com.pinterest.settingsAccount.framework.screens;

import aa1.q;
import android.os.Parcel;
import android.os.Parcelable;
import ba1.y;
import ca1.o;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.g;
import ea1.v0;
import k91.c;
import k91.e;
import k91.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import la1.p;
import lb.l0;
import org.jetbrains.annotations.NotNull;
import pc1.d;
import q91.g1;
import q91.q0;
import q91.s0;
import q91.u0;
import q91.w0;
import u91.h;
import z91.m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b \b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'¨\u0006("}, d2 = {"Lcom/pinterest/settingsAccount/framework/screens/SettingsAccountFeatureLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/settingsAccount/framework/screens/a", "SETTINGS_CONVERT_TO_PERSONAL", "SETTINGS_CONVERT_TO_BUSINESS", "SETTINGS_ADD_ACCOUNT", "SETTINGS_CREATE_BUSINESS_LANDING", "SETTINGS_BUSINESS_TYPE", "SETTINGS_CONTACT_NAME", "SETTINGS_EMAIL", "SETTINGS_GENDER", "SETTINGS_PASSWORD", "SETTINGS_ACCOUNT_MANAGEMENT", "SETTINGS_DEACTIVATE_ACCOUNT", "SETTINGS_CLOSE_ACCOUNT", "SETTINGS_ACCOUNT_SWITCHER", "SETTINGS_CLAIM_REDESIGN", "SETTINGS_LIST_CLAIMED_ACCOUNTS", "SETTINGS_CLAIMED_AMAZON_ACCOUNT", "SETTINGS_CLAIMED_TARGET_ACCOUNT", "SETTINGS_PROFILE_VISIBILITY", "SETTINGS_CLAIM_SUCCESS", "SETTINGS_AUTO_ORG_OPT_IN", "SETTINGS_CLAIM_MIGRATION", "EMAIL_OTP_CONFIRMATION", "account_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class SettingsAccountFeatureLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ SettingsAccountFeatureLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<SettingsAccountFeatureLocation> CREATOR;

    @NotNull
    public static final a Companion;
    public static final SettingsAccountFeatureLocation SETTINGS_CONVERT_TO_PERSONAL = new SettingsAccountFeatureLocation() { // from class: com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation.SETTINGS_CONVERT_TO_PERSONAL

        /* renamed from: a, reason: collision with root package name */
        public final Class f51810a = e.class;

        /* renamed from: b, reason: collision with root package name */
        public final g f51811b = g.MODAL;

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF51815b() {
            return this.f51811b;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51824a() {
            return this.f51810a;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF49203a() {
            return false;
        }
    };
    public static final SettingsAccountFeatureLocation SETTINGS_CONVERT_TO_BUSINESS = new SettingsAccountFeatureLocation() { // from class: com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation.SETTINGS_CONVERT_TO_BUSINESS

        /* renamed from: a, reason: collision with root package name */
        public final Class f51808a = k91.g.class;

        /* renamed from: b, reason: collision with root package name */
        public final g f51809b = g.MODAL;

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF51815b() {
            return this.f51809b;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51824a() {
            return this.f51808a;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF49203a() {
            return false;
        }
    };
    public static final SettingsAccountFeatureLocation SETTINGS_ADD_ACCOUNT = new SettingsAccountFeatureLocation() { // from class: com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation.SETTINGS_ADD_ACCOUNT

        /* renamed from: a, reason: collision with root package name */
        public final Class f51789a = c.class;

        /* renamed from: b, reason: collision with root package name */
        public final g f51790b = g.MODAL;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f51791c = true;

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF51815b() {
            return this.f51790b;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51824a() {
            return this.f51789a;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF51825b() {
            return this.f51791c;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF49203a() {
            return false;
        }
    };
    public static final SettingsAccountFeatureLocation SETTINGS_CREATE_BUSINESS_LANDING = new SettingsAccountFeatureLocation() { // from class: com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation.SETTINGS_CREATE_BUSINESS_LANDING

        /* renamed from: a, reason: collision with root package name */
        public final Class f51812a = j.class;

        /* renamed from: b, reason: collision with root package name */
        public final g f51813b = g.MODAL;

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF51815b() {
            return this.f51813b;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51824a() {
            return this.f51812a;
        }
    };
    public static final SettingsAccountFeatureLocation SETTINGS_BUSINESS_TYPE = new SettingsAccountFeatureLocation() { // from class: com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation.SETTINGS_BUSINESS_TYPE

        /* renamed from: a, reason: collision with root package name */
        public final Class f51794a = q0.class;

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51824a() {
            return this.f51794a;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF49203a() {
            return false;
        }
    };
    public static final SettingsAccountFeatureLocation SETTINGS_CONTACT_NAME = new SettingsAccountFeatureLocation() { // from class: com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation.SETTINGS_CONTACT_NAME

        /* renamed from: a, reason: collision with root package name */
        public final Class f51807a = s0.class;

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51824a() {
            return this.f51807a;
        }
    };
    public static final SettingsAccountFeatureLocation SETTINGS_EMAIL = new SettingsAccountFeatureLocation() { // from class: com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation.SETTINGS_EMAIL

        /* renamed from: a, reason: collision with root package name */
        public final Class f51816a = u0.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f51817b = true;

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51824a() {
            return this.f51816a;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF51825b() {
            return this.f51817b;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF49203a() {
            return false;
        }
    };
    public static final SettingsAccountFeatureLocation SETTINGS_GENDER = new SettingsAccountFeatureLocation() { // from class: com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation.SETTINGS_GENDER

        /* renamed from: a, reason: collision with root package name */
        public final Class f51818a = w0.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f51819b = true;

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51824a() {
            return this.f51818a;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF51825b() {
            return this.f51819b;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF49203a() {
            return false;
        }
    };
    public static final SettingsAccountFeatureLocation SETTINGS_PASSWORD = new SettingsAccountFeatureLocation() { // from class: com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation.SETTINGS_PASSWORD

        /* renamed from: a, reason: collision with root package name */
        public final Class f51822a = g1.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f51823b = true;

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51824a() {
            return this.f51822a;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF51825b() {
            return this.f51823b;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF49203a() {
            return false;
        }
    };
    public static final SettingsAccountFeatureLocation SETTINGS_ACCOUNT_MANAGEMENT = new SettingsAccountFeatureLocation() { // from class: com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation.SETTINGS_ACCOUNT_MANAGEMENT

        /* renamed from: a, reason: collision with root package name */
        public final Class f51784a = h.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f51785b = true;

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51824a() {
            return this.f51784a;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF51825b() {
            return this.f51785b;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF49203a() {
            return false;
        }
    };
    public static final SettingsAccountFeatureLocation SETTINGS_DEACTIVATE_ACCOUNT = new SettingsAccountFeatureLocation() { // from class: com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation.SETTINGS_DEACTIVATE_ACCOUNT

        /* renamed from: a, reason: collision with root package name */
        public final Class f51814a = qa1.e.class;

        /* renamed from: b, reason: collision with root package name */
        public final g f51815b = g.MODAL;

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF51815b() {
            return this.f51815b;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51824a() {
            return this.f51814a;
        }
    };
    public static final SettingsAccountFeatureLocation SETTINGS_CLOSE_ACCOUNT = new SettingsAccountFeatureLocation() { // from class: com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation.SETTINGS_CLOSE_ACCOUNT

        /* renamed from: a, reason: collision with root package name */
        public final Class f51805a = p.class;

        /* renamed from: b, reason: collision with root package name */
        public final g f51806b = g.MODAL;

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF51815b() {
            return this.f51806b;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51824a() {
            return this.f51805a;
        }
    };
    public static final SettingsAccountFeatureLocation SETTINGS_ACCOUNT_SWITCHER = new SettingsAccountFeatureLocation() { // from class: com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation.SETTINGS_ACCOUNT_SWITCHER

        /* renamed from: a, reason: collision with root package name */
        public final Class f51786a = ki0.c.class;

        /* renamed from: b, reason: collision with root package name */
        public final g f51787b = g.MODAL;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f51788c = true;

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF51815b() {
            return this.f51787b;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51824a() {
            return this.f51786a;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF51825b() {
            return this.f51788c;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF49203a() {
            return false;
        }
    };
    public static final SettingsAccountFeatureLocation SETTINGS_CLAIM_REDESIGN = new SettingsAccountFeatureLocation() { // from class: com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation.SETTINGS_CLAIM_REDESIGN

        /* renamed from: a, reason: collision with root package name */
        public final Class f51801a = v0.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f51802b = true;

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51824a() {
            return this.f51801a;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF51825b() {
            return this.f51802b;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF49203a() {
            return false;
        }
    };
    public static final SettingsAccountFeatureLocation SETTINGS_LIST_CLAIMED_ACCOUNTS = new SettingsAccountFeatureLocation() { // from class: com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation.SETTINGS_LIST_CLAIMED_ACCOUNTS

        /* renamed from: a, reason: collision with root package name */
        public final Class f51820a = y.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f51821b = true;

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51824a() {
            return this.f51820a;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF51825b() {
            return this.f51821b;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF49203a() {
            return false;
        }
    };
    public static final SettingsAccountFeatureLocation SETTINGS_CLAIMED_AMAZON_ACCOUNT = new SettingsAccountFeatureLocation() { // from class: com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation.SETTINGS_CLAIMED_AMAZON_ACCOUNT

        /* renamed from: a, reason: collision with root package name */
        public final Class f51795a = m.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f51796b = true;

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51824a() {
            return this.f51795a;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF51825b() {
            return this.f51796b;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF49203a() {
            return false;
        }
    };
    public static final SettingsAccountFeatureLocation SETTINGS_CLAIMED_TARGET_ACCOUNT = new SettingsAccountFeatureLocation() { // from class: com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation.SETTINGS_CLAIMED_TARGET_ACCOUNT

        /* renamed from: a, reason: collision with root package name */
        public final Class f51797a = q.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f51798b = true;

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51824a() {
            return this.f51797a;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF51825b() {
            return this.f51798b;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF49203a() {
            return false;
        }
    };
    public static final SettingsAccountFeatureLocation SETTINGS_PROFILE_VISIBILITY = new SettingsAccountFeatureLocation() { // from class: com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation.SETTINGS_PROFILE_VISIBILITY

        /* renamed from: a, reason: collision with root package name */
        public final Class f51824a = d.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f51825b = true;

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51824a() {
            return this.f51824a;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF51825b() {
            return this.f51825b;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF49203a() {
            return false;
        }
    };
    public static final SettingsAccountFeatureLocation SETTINGS_CLAIM_SUCCESS = new SettingsAccountFeatureLocation() { // from class: com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation.SETTINGS_CLAIM_SUCCESS

        /* renamed from: a, reason: collision with root package name */
        public final Class f51803a = ga1.p.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f51804b = true;

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51824a() {
            return this.f51803a;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF51825b() {
            return this.f51804b;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF49203a() {
            return false;
        }
    };
    public static final SettingsAccountFeatureLocation SETTINGS_AUTO_ORG_OPT_IN = new SettingsAccountFeatureLocation() { // from class: com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation.SETTINGS_AUTO_ORG_OPT_IN

        /* renamed from: a, reason: collision with root package name */
        public final Class f51792a = v91.m.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f51793b = true;

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51824a() {
            return this.f51792a;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF51825b() {
            return this.f51793b;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF49203a() {
            return false;
        }
    };
    public static final SettingsAccountFeatureLocation SETTINGS_CLAIM_MIGRATION = new SettingsAccountFeatureLocation() { // from class: com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation.SETTINGS_CLAIM_MIGRATION

        /* renamed from: a, reason: collision with root package name */
        public final Class f51799a = o.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f51800b = true;

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51824a() {
            return this.f51799a;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF51825b() {
            return this.f51800b;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF49203a() {
            return false;
        }
    };
    public static final SettingsAccountFeatureLocation EMAIL_OTP_CONFIRMATION = new SettingsAccountFeatureLocation() { // from class: com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation.EMAIL_OTP_CONFIRMATION

        /* renamed from: a, reason: collision with root package name */
        public final Class f51781a = n91.q.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f51782b = true;

        /* renamed from: c, reason: collision with root package name */
        public final g f51783c = g.MODAL;

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF51815b() {
            return this.f51783c;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51824a() {
            return this.f51781a;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF51825b() {
            return this.f51782b;
        }

        @Override // com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF49203a() {
            return false;
        }
    };

    private static final /* synthetic */ SettingsAccountFeatureLocation[] $values() {
        return new SettingsAccountFeatureLocation[]{SETTINGS_CONVERT_TO_PERSONAL, SETTINGS_CONVERT_TO_BUSINESS, SETTINGS_ADD_ACCOUNT, SETTINGS_CREATE_BUSINESS_LANDING, SETTINGS_BUSINESS_TYPE, SETTINGS_CONTACT_NAME, SETTINGS_EMAIL, SETTINGS_GENDER, SETTINGS_PASSWORD, SETTINGS_ACCOUNT_MANAGEMENT, SETTINGS_DEACTIVATE_ACCOUNT, SETTINGS_CLOSE_ACCOUNT, SETTINGS_ACCOUNT_SWITCHER, SETTINGS_CLAIM_REDESIGN, SETTINGS_LIST_CLAIMED_ACCOUNTS, SETTINGS_CLAIMED_AMAZON_ACCOUNT, SETTINGS_CLAIMED_TARGET_ACCOUNT, SETTINGS_PROFILE_VISIBILITY, SETTINGS_CLAIM_SUCCESS, SETTINGS_AUTO_ORG_OPT_IN, SETTINGS_CLAIM_MIGRATION, EMAIL_OTP_CONFIRMATION};
    }

    static {
        SettingsAccountFeatureLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
        CREATOR = new com.pinterest.feature.todaytab.a(20);
    }

    public /* synthetic */ SettingsAccountFeatureLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static SettingsAccountFeatureLocation valueOf(String str) {
        return (SettingsAccountFeatureLocation) Enum.valueOf(SettingsAccountFeatureLocation.class, str);
    }

    public static SettingsAccountFeatureLocation[] values() {
        return (SettingsAccountFeatureLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public g getF51815b() {
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
    public abstract /* synthetic */ Class getF51824a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF51825b() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF51715d() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF49203a() {
        return super.getF49203a();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF51723b() {
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

    private SettingsAccountFeatureLocation(String str, int i13) {
    }
}
