/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.ejb.Stateless;
import javax.inject.Inject;


/**
 *
 * @author Loek
 */
@Stateless
public class KwetterService {
    @Inject private Postingservice postingService;
    @Inject private Userservice userService;
    
}
