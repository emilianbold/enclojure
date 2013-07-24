/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.enclojure.ide.nb.actions;

import org.openide.cookies.EditorCookie;
import org.openide.nodes.Node;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import org.openide.util.actions.CookieAction;
import clojure.lang.RT;
import clojure.lang.Var;
import org.openide.util.Exceptions;

public final class ChangeReplNamespaceAction extends CookieAction {

    final Var loadNamespaceFn = RT.var("org.enclojure.ide.nb.actions.action-handler", "load-namespace-action");
    
    protected void performAction(Node[] activatedNodes) {
        try {
            RT.load("org/enclojure/ide/nb/actions/action_handler");
            loadNamespaceFn.invoke(activatedNodes);
        } catch (Exception ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    protected int mode() {
        return CookieAction.MODE_EXACTLY_ONE;
    }

    public String getName() {
        return NbBundle.getMessage(ChangeReplNamespaceAction.class, "CTL_ChangeReplNamespaceAction");
    }

    protected Class[] cookieClasses() {
        return new Class[]{EditorCookie.class};
    }

    @Override
    protected void initialize() {
        super.initialize();
        // see org.openide.util.actions.SystemAction.iconResource() Javadoc for more details
        putValue("noIconInMenu", Boolean.TRUE);
    }

    public HelpCtx getHelpCtx() {
        return HelpCtx.DEFAULT_HELP;
    }

    @Override
    protected boolean asynchronous() {
        return false;
    }
}

