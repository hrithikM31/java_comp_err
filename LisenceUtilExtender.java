/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.floreantpos.util;

import java.util.Iterator;
import javax.json.JsonObject;
import java.io.Reader;
import javax.json.Json;
import java.io.StringReader;

import javax.swing.AbstractAction;
import java.util.List;
import javax.swing.JDialog;
import java.io.File;
import java.awt.Component;
import org.apache.commons.logging.LogFactory;
import com.orocube.licensemanager.InvalidLicenseException;
import com.orocube.licensemanager.ui.InvalidPluginDialog;
import com.orocube.licensemanager.LicenseUtil;
import com.orocube.common.util.TerminalUtil;
import com.orocube.licensemanager.OroLicense;
import com.orocube.licensemanager.ui.LicenseSelectionListener;

/**
 *
 * @author Dell
 */
public abstract class LisenceUtilExtender extends AbstractFloreantPlugin
{
    private OroLicense license;
    
    @Override
    public boolean requireLicense() {
        return false;
    }
    
    @Override
    public void initLicense() {
//        try {
//            this.license = LicenseUtil.loadAndValidate(this.getProductName(), this.getProductVersion(), TerminalUtil.getSystemUID());
//        }
//        catch (InvalidLicenseException e) {
//            InvalidPluginDialog.show((LicenseSelectionListener)this, this.getParent(), e.getMessage(), "Plugin error!", this.getProductName(), this.getProductVersion(), TerminalUtil.getSystemUID());
//        }
//        catch (Exception e2) {
//            LogFactory.getLog((Class)this.getClass()).error((Object)e2);
//        }
    }
    
    @Override
    public abstract String getId();
    
    public abstract String getProductName();
    
    public abstract String getProductVersion();
    
    public abstract Component getParent();
    
    public void licenseFileSelected(final File pluginFile) throws Exception {
//        try {
//            final OroLicense newLicense = LicenseUtil.loadAndValidate(pluginFile, this.getProductName(), this.getProductVersion(), TerminalUtil.getSystemUID());
//            LicenseUtil.copyLicenseFile(pluginFile, this.getProductName());
//            this.setLicense(newLicense);
//        }
//        catch (Exception e) {
//            LogFactory.getLog((Class)this.getClass()).error((Object)e);
//            throw e;
//        }
    }
    
    @Override
    public boolean hasValidLicense() {
        return true;
    }
    
    public OroLicense getLicense() {
        return this.license;
    }
    
    public void setLicense(final OroLicense license) {
        this.license = license;
    }
    
    @Override
    public void initBackoffice() {
    }
    
    @Override
    public void initConfigurationView(final JDialog dialog) {
    }
    
    @Override
    public List<AbstractAction> getSpecialFunctionActions() {
        return null;
    }
    
    @Override
    public void initUI() {
    }
    
    public void restartPOS(final boolean restart) {
    }
}
